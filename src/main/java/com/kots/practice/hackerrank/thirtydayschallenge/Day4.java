/**
 * Task
 * Write a Person class with an instance variable, age, and a constructor that takes an integer,
 * initialAge, as a parameter. The constructor must assign initialAge to age after confirming the
 * argument passed as initialAge is not negative;
 * if a negative argument is passed as initialAge, the constructor should set age to 0
 * and print "Age is not valid, setting age to 0.".
 * In addition, you must write the following instance methods:
 * yearPasses() should increase the  instance variable by 1.
 * amIOld() should perform the following conditional actions:
 * If age <13, print "You are young.".
 * If age >=13 and <18, print "You are a teenager.".
 * Otherwise, print "You are old.".
 * <p>
 * Input Format
 * The first line contains an integer, T (the number of test cases), and the T subsequent lines
 * each contain an integer denoting the age of a Person instance.
 * <p>
 * Constraints
 * 1<=T<=4
 * -5<=age<=30
 */

package com.kots.practice.hackerrank.thirtydayschallenge;

import java.util.Scanner;

public class Day4 {
    private int age;

    public Day4(int age) {
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Day4 person = new Day4(age);
            person.amIOld();
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scanner.close();
    }

    public String amIOld() {
        if (age < 13) {
            return "You are young.";
        } else if (age < 18) {
            return "You are a teenager.";
        } else {
            return "You are old.";
        }
    }

    public int yearPasses() {
        return age++;
    }

    public int getAge() {
        return age;
    }
}
