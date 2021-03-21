package com.home.sandbox.javaRushExamples.instanceofExample;

public class Main {
    public static void main(String[] args) {
        Animal catBarsik = new Cat();
        Animal catShultz = new MainCoon();
        Animal catVaska = new Animal();

        System.out.println(catBarsik instanceof Cat);
        System.out.println(catShultz instanceof Animal);

    }
}
