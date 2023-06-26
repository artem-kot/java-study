package com.kots.practice.javarush.streams.inputStreams;

/*
Write a program which takes file path from the console and then prints file's content to console.
Program is expected to read all the characters besides space, comma, and period.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class JavaRushTask1506 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> content = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String line : content) {
                line = line.replaceAll("\\s|\\.|,", "");
                System.out.println(line);
            }
        } catch (IOException ignored) {
        }
    }
}
