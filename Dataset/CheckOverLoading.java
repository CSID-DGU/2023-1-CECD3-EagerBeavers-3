package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CheckOverLoading {

    private static final String MAIN_PATTERN = "public static void main(String[] args)";
    private static final String METHOD_PATTERN = "(\\s*(public|private|protected)?\\s+)?(static\\s+)?\\w+\\s+\\w+\\s*\\(.*\\)\\s*\\{?"; //public void 메서드명 ()
    private static final String METHOD_PATTERN_GENERIC = "(\\s*(public|private|protected)?\\s+)?(static\\s+)?<\\w+>\\s+void\\s+\\w+\\(.*\\)\\s*\\{?";

    public static boolean isOverLoading(String path) throws IOException {
        List<String> methodNames = new ArrayList<>();

        for (String line : Files.readAllLines(Paths.get(path))) {
            if (line.contains(MAIN_PATTERN)) {
                continue;
            }

            if (line.matches(METHOD_PATTERN) || line.matches(METHOD_PATTERN_GENERIC)) {
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
