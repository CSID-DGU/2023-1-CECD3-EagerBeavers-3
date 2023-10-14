package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;
import java.nio.file.Paths;

public class ExtractMultipleMethodFile {
    static int count = 0;
    static int[] files = new int[3000];

    public static void main(String[] args) {
        String directoryPath = "/Users/yunjiseong/Downloads/originalJavaFiles/"; // 검사할 디렉토리 경로를 지정하세요.
        try (Stream<Path> paths = Files.walk(Path.of(directoryPath))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        if (hasMethods(path.toString())) {
                            count += 1;
                            System.out.println("파일 이름: " + extractNumbersFromFile( path.getFileName().toString()));
                            files[count] = extractNumbersFromFile( path.getFileName().toString());

                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
        Arrays.sort(files); // 배열을 오름차순으로 정렬
        for (int file : files) {
            if(file != 0) System.out.print(file + ",");
        }

    }

    private static boolean hasMethods(String filePath) {
        try {
            boolean hasMainMethod = false;
            boolean hasOtherMethod = false;
            String mainMethodLine = "public static void main(String[] args)";

            for (String line : Files.readAllLines(Paths.get(filePath))) {
                if (line.contains(mainMethodLine)) {
                    hasMainMethod = true;
                }

                if (line.contains("public") && line.contains("(") && line.contains(")") && line.contains("{") && !line.contains(mainMethodLine)) {
                    hasOtherMethod = true;
                }
                if (line.contains("static") && line.contains("(") && line.contains(")") && line.contains("{") && !line.contains(mainMethodLine)) {
                    hasOtherMethod = true;
                }
            }

            // 메인 메소드만 있는 경우 파일 이름을 출력하지 않음
            // 메인 메소드와 다른 메소드가 모두 있는 경우 파일 이름을 출력함
            return hasOtherMethod && (!hasMainMethod || hasMainMethod && hasOtherMethod);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static int extractNumbersFromFile(String fileName) {
        int number = 0;
        boolean numberStarted = false;

        // 파일 이름을 순회하면서 숫자 추출
        for (char character : fileName.toCharArray()) {
            if (Character.isDigit(character)) {
                number = number * 10 + Character.getNumericValue(character);
                numberStarted = true;
            } else if (numberStarted) {
                // 숫자가 시작된 후 숫자가 아닌 문자가 나오면 종료
                break;
            }
        }
        return number;
    }
}
