package com.home.sandbox.classes.stack;

public class Stack { //page 182
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full ");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack is not full ");
            return 0;
        } else return stck[tos--];
    }
}
