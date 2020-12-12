package com.home.sandbox.classes.box.box7;

public class Box { //page 179
    double width;
    double height;
    double depth;

    Box(double w, double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume (){
        return width*height*depth;
    }
}
