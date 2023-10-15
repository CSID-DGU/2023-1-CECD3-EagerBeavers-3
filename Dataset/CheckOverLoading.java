package org.example;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class CheckOverLoading {

    public static void main(String[] args) {

        String directoryPath = "/Users/gilga-eun/Downloads/commentDeleted";
        List<String> overLoadingFiles = new ArrayList<>();
        Map<Integer, List<String>> countMethodNotMain = new ConcurrentHashMap<>();
        try (Stream<Path> paths = Files.walk(Path.of(directoryPath))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            final int count = countNotMain(path.toString());
                            List<String> fileNames = countMethodNotMain.getOrDefault(count, new ArrayList<>());
                            fileNames.add(path.getFileName().toString());
                            countMethodNotMain.put(count, fileNames);
                        } catch (Exception e) {

                        }
                    });

        } catch (Exception e) {
        }

        for (Integer count : countMethodNotMain.keySet()) {
            List<String> fileNames = countMethodNotMain.get(count);
            System.out.println("count = " + count + " fileName's size is " + fileNames.size());
            for (String fileName : fileNames) {
                System.out.print(fileName + ", ");
            }
            System.out.println();
        }
    }

    private static final String MAIN_PATTERN = "public static void main(String[] args)";
    private static final String PATTERN = "^\\s*(\\w*\\s)?(\\w*\\s)?(((\\w*\\<\\w*(\\[\\])*\\>(\\[\\])*)|(\\w*(\\[\\])*))\\s*)?(\\w*\\s)?\\s*\\w*[(](\\s?\\w*(\\[\\])*\\s\\w*,?)*[)]\\s?\\{?$";

    public static int countNotMain(String path) throws IOException {
        if(Files.size(Paths.get(path)) == 0) return 0;
        List<String> methodNames = new ArrayList<>();
        int count = 0;
        for (String line : Files.readAllLines(Paths.get(path), Charset.defaultCharset())) {
            if (line.contains(MAIN_PATTERN)) {
                continue;
            }

            if (line.matches(PATTERN)) {
                /*
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

                 */
                count++;
            }
        }
        return count;
    }
}
