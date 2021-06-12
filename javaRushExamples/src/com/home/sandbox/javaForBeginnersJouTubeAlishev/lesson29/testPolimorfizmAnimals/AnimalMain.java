package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29.testPolimorfizmAnimals;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Murzik", 1);
        Animal cat1 = new Cat("Murzik", 1);
        Cat cat2 = new Cat("Murzik", 1);
        cat.say();
        System.out.println(Animal.qantityAnimals());
    }
}
