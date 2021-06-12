package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAnimals;

public class Cat extends Animal{

    public Cat(String name, int number) {
        super(name, number);
    }

    @Override
    public void say() {
        System.out.println("Cat say meaow!");
    }
}
