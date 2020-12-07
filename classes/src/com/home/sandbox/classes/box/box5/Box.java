package com.home.sandbox.classes.box.box5;

public class Box {//page 176
    double width;
    double height;
    double dept;

    double volume () {
        return width * height * dept;
    }
        void setDim (double w, double h, double d){
            width=w;
            height=h;
            dept=d;
        }
    }
