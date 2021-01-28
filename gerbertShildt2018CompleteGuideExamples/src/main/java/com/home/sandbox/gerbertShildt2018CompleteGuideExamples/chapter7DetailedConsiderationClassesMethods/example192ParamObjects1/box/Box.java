package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example192ParamObjects1.box;

public class Box { //page 192
    double width;
    double height;
    double depth;

    Box (Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width =-1;
        height =-1;
        depth =-1;
    }
    Box(double param){
        width= height=depth=param;

    }
    double volume (){
        return width*height*depth;
    }
}
