package com.home.sandbox.controlStatements;

public class IfElseExample { //page134
    public static void main(String[] args) {
        int month = 5; //april
        String season;
        if (month==12 || month==1 || month==2) {
            season = "winter";
        }else if (month==3 || month==4 || month==5) {
            season = "spring";
        }else if (month==6 || month==7 || month==8) {
            season = "summer";
        }else if (month==9 || month==10 || month==11){
            season="fall";}
        else{
            season = "false";
        }

        System.out.println("month "+month+ " match " + season);

    }
}

