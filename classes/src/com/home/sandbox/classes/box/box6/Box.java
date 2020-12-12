package com.home.sandbox.classes.box.box6;

public class Box { //page 177
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Construction object Box");
        width=10;
        height=10;
        depth=10;
    }

    double volume (){
        return width*height*depth;
    }
}
