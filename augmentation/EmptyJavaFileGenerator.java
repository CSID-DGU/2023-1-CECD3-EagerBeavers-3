package com.prograngers.backend.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmptyJavaFileGenerator {

    public static void main(String[] args) {
        String directoryPath = "/Users/gilga-eun/Downloads/augmentation/new2";
        List<String> fileNames = new ArrayList<>();
        String suffix = ".java";
        for (int i = 5500; i < 5750; i++) {
            fileNames.add(i+suffix);
        }

        Path directory = Paths.get(directoryPath);

        try {
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }

            for (String fileName : fileNames) {
                Path filePath = directory.resolve(fileName);

                Files.createFile(filePath);
                System.out.println(fileName + " 파일이 성공적으로 생성되었습니다.");
            }
        } catch (IOException e) {
            System.err.println("파일 생성 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
