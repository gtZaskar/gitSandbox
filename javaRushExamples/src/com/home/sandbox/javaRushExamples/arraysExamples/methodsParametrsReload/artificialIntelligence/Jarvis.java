package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.artificialIntelligence;

public class Jarvis {
    public void sayHi(String name){
        System.out.println("hello, " + name + " how are you?");
    }

    public void sayHi (String firstName, String secondName){
        System.out.println("hello, " + firstName + " , " + secondName + " how are you?");
    }

    public void sayHi(String... names){
        for (String name : names) {
            System.out.println("hello, " + name + " how are you?");

        }

    }
}
