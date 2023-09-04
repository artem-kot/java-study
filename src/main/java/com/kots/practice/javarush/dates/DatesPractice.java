package com.kots.practice.javarush.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesPractice {
    /*
    Date class can store time as milliseconds passed since 01.01.1970 (ubiquitous Unix time constant).
    When you want to specify a date, remember that year counts from 1900, months are counted from 0.
    Days are counted from 1.
     */

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

//        Let's specify the date I first came to Berlin. Note the year and the month.
        Date berlinEntry = new Date(122, 9, 6);
        System.out.println(berlinEntry);

//        Let's specify the time I was born at.
        Date birthday = new Date(94, 2, 23, 21, 50, 00);
        System.out.println(birthday);

//        Let's access some of the date components.
        System.out.println(birthday.getYear()); //year
        System.out.println(birthday.getMonth()); //month
        System.out.println(birthday.getDate()); //monthday
        System.out.println(birthday.getDay()); //weekday
        System.out.println(birthday.getHours()); //hours
        System.out.println(birthday.getMinutes()); //minutes
        System.out.println(birthday.getSeconds()); //seconds
        System.out.println(birthday.getTime()); //milliseconds since the date

//        Let's format the output.
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY HH:mm:SS");
        System.out.println(formatter.format(birthday));

//        Let's also parse the date from a string.
        Date parsedDate = new Date();
        parsedDate.setTime(Date.parse("Sep 4 11:09:16 2023"));
//        Date date = new Date("Sep 4 11:09:16 2023"); will also work here.
        System.out.println(parsedDate);
    }
}
