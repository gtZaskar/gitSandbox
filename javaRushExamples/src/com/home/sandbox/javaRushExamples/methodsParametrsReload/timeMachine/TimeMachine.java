package com.home.sandbox.javaRushExamples.methodsParametrsReload.timeMachine;

public class TimeMachine {
    public void goToFuture(int currentYear) {
        currentYear = currentYear + 10;
    }

    public void goToPast(int currentYear) {
        System.out.println("Метод goToPast начал работу!");

        System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
        currentYear = currentYear - 10;
        System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);

    }

   public void goToFuture(Cat cat) {
        cat.age += 10;
    }

    public void goToPast(Cat cat) {
        cat.age -= 10;
    }

   /* public void goToFuture(Cat cat) { //dont correct work!!!!
        cat= new Cat(cat.age);
        cat.age += 10;
    }

    public void goToPast(Cat cat) {
        cat= new Cat(cat.age);
        cat.age -= 10;
    }*/


}
