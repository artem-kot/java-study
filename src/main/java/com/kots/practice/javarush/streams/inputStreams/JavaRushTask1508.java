package com.kots.practice.javarush.streams.inputStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Instead of reading console using Scanner class, read it using BufferedReader.
 */

public class JavaRushTask1508 {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader);
        ) {
            String line = buff.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                }
            }
        } catch (IOException ignored) {
        }
    }
}
