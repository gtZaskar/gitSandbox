package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example265UseInterfaces.dynStack;

import main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example265UseInterfaces.IntStack;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
        //placing an item on the stack

    public void push(int item){
        if (tos==stck.length-1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }else
            stck[++tos] = item;
        }
    // extract element from the stack
    public int pop(){
        if (tos<0){
            System.out.println("Stack is not loaded");
            return 0;
        }else
            return stck[tos--];
    }
}
