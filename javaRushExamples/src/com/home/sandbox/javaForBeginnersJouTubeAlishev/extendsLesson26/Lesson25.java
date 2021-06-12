package com.home.sandbox.javaForBeginnersJouTubeAlishev.extendsLesson26;

import com.home.sandbox.javaForBeginnersJouTubeAlishev.Lesson19;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(dog instanceof Animal);
        dog.showName();
    }
}
