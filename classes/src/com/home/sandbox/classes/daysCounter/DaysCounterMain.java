package com.home.sandbox.classes.daysCounter;

import java.util.Scanner;

public class DaysCounterMain {
    public static void main(String[] args) {
       /* System.out.println("please, write your birthday :");
        Scanner day = new Scanner(System.in);
        int birthDay = day.nextInt();
        System.out.println("please, write your birthday month  (from 1 to 12) :");
        Scanner month = new Scanner(System.in);
        int birthMonth = month.nextInt();*/
        System.out.println("please, write your birthday year :");
        Scanner year = new Scanner(System.in);
        int birthYear = year.nextInt();

        System.out.println("please, write which year do yo want :");
        Scanner year1 = new Scanner(System.in);
        int birthYear1 = year1.nextInt();

        DaysCounter howYears = new DaysCounter();
        System.out.println("you are " + howYears.countYears(birthYear,birthYear1)+ " years");

        DaysCounter tallYears = new DaysCounter();
        System.out.println( tallYears.countTallDaysInYear(birthYear,birthYear1) + " years ->");

        DaysCounter daysCounter = new DaysCounter();
        System.out.println("days : " + );

    }
}
