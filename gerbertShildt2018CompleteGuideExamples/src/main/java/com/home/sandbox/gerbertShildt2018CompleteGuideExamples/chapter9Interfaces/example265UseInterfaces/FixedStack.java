package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example265UseInterfaces;

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

   public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //placing an item on the stack
    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full. ");
        } else {
            stck[++tos] = item;
        }
    }

    // extract element from the stack
    @Override
    public int pop() {
        if (tos<0){
            System.out.println("stack is not loaded. ");
            return 0;
        }else
        return stck[tos--];
    }
}
