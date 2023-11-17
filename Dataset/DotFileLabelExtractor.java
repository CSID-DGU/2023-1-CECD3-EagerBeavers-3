package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotFileLabelExtractor {

    public static void main(String[] args) {
        try {
            String folderPath = "/Users/yunjiseong/Desktop/2023_2학기/컴퓨터종합설계2/convertedCpgReduced_1";
            processAllDotFiles(folderPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processAllDotFiles(String folderPath) throws IOException {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().endsWith(".dot")) {
                    System.out.println("Processing file: " + file.getName());
                    extractLabels(file.getAbsolutePath());
                    extractEdgeInfo(file.getAbsolutePath());
                }
            }
        }
    }

    private static void extractLabels(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder dotContent = new StringBuilder();
        List<String> nodes = new ArrayList<>();

        // Read the .dot file
        while ((line = reader.readLine()) != null) {
            dotContent.append(line).append("\n");
        }
        reader.close();

        // Use regular expression to extract labels
        String dotFileContent = dotContent.toString();
        Pattern pattern = Pattern.compile("\"(\\d+)\"\\s*\\[label\\s*=\\s*<\\s*\\(([^,]+)");

        Matcher matcher = pattern.matcher(dotFileContent);

        // Extract and print labels
        while (matcher.find()) {
            String nodeNumber = matcher.group(1);
            String literalValue = matcher.group(2);

            String node = nodeNumber +": " + literalValue;
            nodes.add(node);
        }
        System.out.println(nodes);

    }
    private static void extractEdgeInfo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder dotContent = new StringBuilder();
        List<String> edges = new ArrayList<>();

        // Read the .dot file
        while ((line = reader.readLine()) != null) {
            dotContent.append(line).append("\n");
        }
        reader.close();

        // Use regular expression to extract labels
        String dotFileContent = dotContent.toString();
        Pattern pattern = Pattern.compile("\"(\\S+)\"\\s*->\\s*\"(\\S+)\"\\s*\\[\\s*label\\s*=\\s*\"([^:]+):\\s*([^\\]]+)\"\\s*\\]");
        Matcher matcher = pattern.matcher(dotFileContent);

        // Extract and print labels
        while (matcher.find()) {
            String sourceNode = matcher.group(1);
            String targetNode = matcher.group(2);
            String label = matcher.group(3);

            String edge = sourceNode + "->" + targetNode +" : "+label;
            edges.add(edge);
        }
        System.out.println(edges);
    }
}
