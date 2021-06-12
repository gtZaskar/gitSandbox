package main.java.com.myHome.test;

public class Starter {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(1l, "one");
        MyClass myClass2 = new MyClass(1l, "one");

        if (myClass1.equals(myClass2)) {
            System.out.print("ok");
        }else {
            System.out.println("not ok");
        }
    }
}

