package com.home.sandbox.javaRushExamples.equalsHashCode.equals;

public class Man {
    int dnaCode;

    public boolean equals(Man obj){
        return this.dnaCode== obj.dnaCode;
    }
    //
    public static void main(String[] args) {

        Man man1=new Man();
        man1.dnaCode=1111222233;

        Man man2=new Man();
        man2.dnaCode=1111222233;

        System.out.println(man1.equals(man2));

        String s1 = "Hello Dolly";
        String s2 = new String("Hello Dolly");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("----------");
        System.out.println(s1==s2.intern());
    }
}
