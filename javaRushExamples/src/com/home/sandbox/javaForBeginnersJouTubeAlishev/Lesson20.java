package com.home.sandbox.javaForBeginnersJouTubeAlishev;

public class Lesson20 {
    public static void main(String[] args) {
        HumanOne human1 = new HumanOne("Vasja", 25);
        human1.printNumberOfPeople();
        HumanOne human2 = new HumanOne("Petja", 29);
      human1.printNumberOfPeople();
      human2.printNumberOfPeople();
      human1.toString();
    }

}

class HumanOne {
    private String name;
    private int age;
    private static int countPeople;




    public HumanOne(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople +=1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HumanOne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void printNumberOfPeople(){
        System.out.println("number of people is  "+ countPeople);
    }

}