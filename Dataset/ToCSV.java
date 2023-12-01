package org.example;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToCSV {

    public static void main(String[] args) {
        try {
            String folderPath = "/Users/yunjiseong/Desktop/2023_2학기/컴퓨터종합설계2/augmentedCPG";
            String outputCSVPath = "/Users/yunjiseong/Desktop/2023_2학기/컴퓨터종합설계2/output_info.csv";

            // Create or clear the existing CSV file and write the header
            writeToCSVHeader(outputCSVPath);

            processAllDotFiles(folderPath, outputCSVPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processAllDotFiles(String folderPath, String outputCSVPath) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".dot")) {
                    System.out.println("Processing file: " + file.getName());
                    try {
                        String nodesAndEdges = extractNodeAndEdgeInfo(file.getAbsolutePath());
                        writeToCSV(file.getName(), nodesAndEdges, outputCSVPath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static String extractNodeAndEdgeInfo(String filePath) throws IOException {
        StringBuilder nodes = new StringBuilder();
        StringBuilder edges = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder dotContent = new StringBuilder();

            // Read the .dot file
            while ((line = reader.readLine()) != null) {
                dotContent.append(line).append("\n");
            }

            // Use regular expression to extract labels and edge information
            String dotFileContent = dotContent.toString();

            // Extract and print labels
            Pattern nodePattern = Pattern.compile("\"(\\d+)\"\\s*\\[label\\s*=\\s*<\\s*\\(([^,]+)");
            Matcher nodeMatcher = nodePattern.matcher(dotFileContent);

            while (nodeMatcher.find()) {
                String nodeNumber = nodeMatcher.group(1);
                String literalValue = nodeMatcher.group(2);

                String node = nodeNumber + ":" + literalValue;
                nodes.append(node).append("|");
            }

            // Extract and print edge information
            Pattern edgePattern = Pattern.compile("\"(\\S+)\"\\s*->\\s*\"(\\S+)\"\\s*\\[\\s*label\\s*=\\s*\"([^:]+):\\s*([^\\]]+)\"\\s*\\]");
            Matcher edgeMatcher = edgePattern.matcher(dotFileContent);

            while (edgeMatcher.find()) {
                String sourceNode = edgeMatcher.group(1);
                String targetNode = edgeMatcher.group(2);
                String label = edgeMatcher.group(3);

                String edge = sourceNode + "->" + targetNode + ":" + label;
                edges.append(edge).append("|");
            }
        }

        return nodes.toString() + "$" + edges.toString();
    }

    private static void writeToCSVHeader(String outputCSVPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputCSVPath))) {
            // Write CSV header
            writer.write("index,nodes,edges\n");
        }
    }

    private static void writeToCSV(String fileName, String nodesAndEdges, String outputCSVPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputCSVPath, true))) {
            // Extract numeric part from the file name
            String cleanedFileName = extractNumericPart(fileName);

            // Split nodes and edges using "|"
            String[] parts = nodesAndEdges.split("\\$");
            if (parts.length == 2) {
                // Write file name, nodes, and edges to CSV
                writer.write(cleanedFileName + ",");
                writer.write("\"" + parts[0] + "\",\"" + parts[1] + "\"\n");
            } else {
                // Handle the case when the format is unexpected
                writer.write("\"\",\"\"," + nodesAndEdges + "\n");
            }
        }
    }

    private static String extractNumericPart(String fileName) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(fileName);

        if (matcher.find()) {
            return matcher.group();
        }

        return "";
    }
}
