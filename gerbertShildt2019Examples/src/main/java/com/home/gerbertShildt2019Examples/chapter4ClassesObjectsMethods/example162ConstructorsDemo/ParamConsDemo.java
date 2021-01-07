package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example162ConstructorsDemo;

public class ParamConsDemo {
    public static void main(String[] args) {
        MyClassParam myClass1 = new MyClassParam(10);
        MyClassParam myClass2 = new MyClassParam(88);

        System.out.println(myClass1.x + " " + myClass2.x);
    }
}
