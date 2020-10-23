package com.home.sandbox.scope;
//demonstration scope of code block
public class Scope {

    public static void main(String[] args) {
        int x; //this variable available all code from method main()
        x=10;
        if (x==10) { //start of new scope available of this code block, both variables x and y available in this scope
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y=100; exception! variable y is not available in this scope but variable x is available in this scope
        System.out.println("x equal: " + x );

    }

}
