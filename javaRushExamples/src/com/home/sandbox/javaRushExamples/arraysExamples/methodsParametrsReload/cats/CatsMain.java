package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.cats;

public class CatsMain {
    public static void main(String[] args) {
        Cat murka = new Cat();
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Barsik";

        barsik.sayMeaow();
        barsik.jump();
    }
}
