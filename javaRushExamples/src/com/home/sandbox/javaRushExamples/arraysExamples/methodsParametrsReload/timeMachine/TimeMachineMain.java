package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.timeMachine;

public class TimeMachineMain {
    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2021;

        System.out.println("what is the year now? - " + currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("and now? - " + currentYear);

        System.out.println("********************");

        Cat barsik = new Cat(5);
        System.out.println("how many years is Barsik? - " + barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("and now? - " + barsik.age );

        System.out.println("Oh no, Barsik stay older on 10 years!!! Go back!!! ");
        timeMachine.goToPast(barsik);
        System.out.println("Ok, we will back former age!!! - " + barsik.age);

    }
}
