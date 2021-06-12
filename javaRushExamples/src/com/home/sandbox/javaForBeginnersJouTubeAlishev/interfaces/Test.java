package com.home.sandbox.javaForBeginnersJouTubeAlishev.interfaces;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Sasha");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        System.out.println("**************");

        Info info1 = new Animal(1);
        Info info2 = new Person("Kolja");


        info1.showInfo();
        info2.showInfo();
        System.out.println(info1 instanceof Animal);
        outputInfo(info2);
        Scanner scanner = new Scanner(System.in);
        boolean  i = scanner.nextBoolean();


    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
