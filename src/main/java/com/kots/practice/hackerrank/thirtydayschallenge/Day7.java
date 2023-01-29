package com.kots.practice.hackerrank.thirtydayschallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 */

public class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        bufferedReader.close();

        int[] array = new int[n];
        for (int i = arr.size(); i > 0; i--) {
            array[arr.size() - i] = arr.get(i - 1);
        }
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(Arrays.toString(array));
    }
}
