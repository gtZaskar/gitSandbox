package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAnimals;

public class Animal {
    private String name;
    private int number;
    private static int counter;

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
        counter++;
    }
    public void move(){
        System.out.println("the animal is moving");
    }
    public void say(){
        System.out.println("the animal is saying");
    }
    public static int qantityAnimals(){
        return counter;
    }
}
