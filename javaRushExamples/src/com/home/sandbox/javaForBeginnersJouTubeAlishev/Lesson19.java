package com.home.sandbox.javaForBeginnersJouTubeAlishev;

public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Jura");
        human.setAge(85);
        human.getInfo();
    }
}
class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge (int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println("Name " +name + " age " + age);
    }
}
