package com.kots.practice.javarush.streams.inputStreams;

/*
Try to fix the given original code so that it would copy content of 1 file to another file.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaRushTask1505 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
