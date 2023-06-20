package com.kots.practice.javarush.streams.inputStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Read file path from the console, then read all lines from the specified file and print them.
While printing, print only odd numbered lines.
 */

public class JavaRushTask1507 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> content = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < content.size(); i++) {
                if(i % 2 == 0) {
                    System.out.println(content.get(i));
                }
            }
        }
    }
}
