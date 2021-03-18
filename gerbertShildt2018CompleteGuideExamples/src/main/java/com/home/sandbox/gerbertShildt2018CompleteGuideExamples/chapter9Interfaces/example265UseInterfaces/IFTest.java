package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example265UseInterfaces;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        //placing  items on the stack
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int j = 0; j < 8; j++) {
            mystack2.push(j);
        }

        // extract elements from the stack
        System.out.println("Stack in mystack1 : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2 : ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
