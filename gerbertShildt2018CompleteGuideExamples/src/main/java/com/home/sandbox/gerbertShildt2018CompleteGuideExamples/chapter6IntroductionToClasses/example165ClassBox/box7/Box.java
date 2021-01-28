package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter6IntroductionToClasses.example165ClassBox.box7;

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
