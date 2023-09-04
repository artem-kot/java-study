package com.kots.practice.javarush.dates;

import java.util.Date;

public class DatesTask1601 {
    static Date birthDate = new Date("Mar 23 1994 21:50:00");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        System.out.println(date.getDay());
        switch (date.getDay()) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 0:
                return "Воскресенье";
        }
        return null;
    }
}
