package com.kots.practice.javarush.collections.arraylist;

// В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату,
// и список сотрудников alreadyGotSalaryEmployees, которые её уже получили.
// Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает
// имя сотрудника, желающего получить зарплату.
//
// Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
// Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
// Добавить имя сотрудника в список alreadyGotSalaryEmployees.
// В списке waitingEmployees заменить имя сотрудника на null.

//	Метод paySalary(String) должен добавлять в список alreadyGotSalaryEmployees имя сотрудника, если он есть в списке waitingEmployees.
//•	Метод paySalary(String) должен заменять имя сотрудника на значение null, если он есть в списке waitingEmployees.
//•	Метод paySalary(String) не должен изменять списки waitingEmployees и alreadyGotSalaryEmployees, если переданного имени нет в списке waitingEmployees.
//•	Если в метод paySalary(String) передается null, метод не должен добавлять это значение в waitingEmployees или alreadyGotSalaryEmployees.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask1209 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Фриле");

        for(String employee : waitingEmployees){
            System.out.println(employee);
        }
        System.out.println("-=====-");
        for(String employee : alreadyGotSalaryEmployees){
            System.out.println(employee);
        }
    }

    public static void paySalary(String name) {
        if(waitingEmployees.contains(name)){
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
