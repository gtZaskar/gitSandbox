package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example200AccessModifiers.stackDemo1;

public class TestStackMain {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }

        // извлечь эти числа из стека

        System.out.print("stack1 : ");
        for (int i =0;i<10;i++) {
            System.out.print(stack1.pop() + "\t");
        }
        System.out.println();
        System.out.print("stack2 : ");
        for (int i =10;i<20;i++) {
            System.out.print(stack2.pop() + "\t");
        }
        // эти операторы недопустимы
        // stack1.tos = -2;
        // stack2.stck[3] = 100;
    }

}

