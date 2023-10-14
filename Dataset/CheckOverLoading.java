package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckOverLoading {

    public static void main(String[] args) {
        String directoryPath = "/Users/gilga-eun/Desktop/test";
        List<String> overLoadingFiles = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Path.of(directoryPath))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            if(isOverLoading(path.toString())){
                                overLoadingFiles.add(path.getFileName().toString());
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String overLoadingFile : overLoadingFiles) {
            System.out.print(overLoadingFile + ",");
        }
        System.out.println();
        System.out.println("overLoadingFiles count = " + overLoadingFiles.size());
    }

    private static final String MAIN_PATTERN = "public static void main(String[] args)";
    private static final String METHOD_PATTERN = "(\\s*(public|private|protected)?\\s+)?(static\\s+)?\\w+\\s+\\w+\\s*\\(.*\\)\\s*\\{?"; //public void 메서드명 ()
    private static final String METHOD_PATTERN_GENERIC = "(\\s*(public|private|protected)?\\s+)?(static\\s+)?<\\w+>\\s+void\\s+\\w+\\(.*\\)\\s*\\{?";
    private static final String METHOD_PATTERN_ARRAY = "(\\s*(public|private|protected)?\\s+)?(static\\s+)?\\w+\\s+\\w+\\(\\w+\\s+\\w+\\)";

    public static boolean isOverLoading(String path) throws IOException {
        List<String> methodNames = new ArrayList<>();

        for (String line : Files.readAllLines(Paths.get(path))) {
            if (line.contains(MAIN_PATTERN)) {
                continue;
            }

            if (line.matches(METHOD_PATTERN) || line.matches(METHOD_PATTERN_GENERIC) || line.matches(METHOD_PATTERN_ARRAY)) {
                int bracketIndex = line.indexOf("(");
                int methodIndex = 0;
                for (int i = bracketIndex; i > 0; i--) {
                    if (line.charAt(i) == ' ') {
                        methodIndex = i;
                        break;
                    }
                }
                String methodName = line.substring(methodIndex + 1, bracketIndex);
                System.out.println("methodName = " + methodName);
                //if (methodNames.contains(methodName)) return true;
                methodNames.add(methodName);
            }
        }
        return false;
    }
}
