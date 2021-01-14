package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.trucks;

public class Truck {
    int length; //длина
    int width; //ширина
    int height; //высота

    int weight;

public int getVolume(){
    int volume = length*width*height;
    return volume;
}
}
