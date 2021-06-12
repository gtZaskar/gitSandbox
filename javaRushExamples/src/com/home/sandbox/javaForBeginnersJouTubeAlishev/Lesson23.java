package com.home.sandbox.javaForBeginnersJouTubeAlishev;

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");//объекты класса mutable могут изменяться
        System.out.println(sb.toString());
        sb.append("Vasiliy");//конкатинация(добавление) строк метод append
        System.out.println(sb.toString());

        System.out.println("*************");
        String x = "good day";
        System.out.println(x);
        System.out.println(x.toUpperCase());
        System.out.println(x);
        x=x.toUpperCase();
        System.out.println(x);


    }
}
