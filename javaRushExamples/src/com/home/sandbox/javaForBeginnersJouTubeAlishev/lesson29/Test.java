package com.home.sandbox.javaForBeginnersJouTubeAlishev.lesson29;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);
        System.out.println("**************");
        Animal animal1 = new Dog();
        test(animal1);
        animal1.eat();

    }

    public static void test(Animal animal) {
        animal.eat();

    }

}
