package main.java.com.home.gerbertShildt2019Examples.chapter4ClassesObjectsMethods.example143Vehicle.paramDemo;

public class ParamDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();

        if (chkNum.isEven(10)) {
            System.out.println("10 - even number");
        }
        if (chkNum.isEven(9)) {
            System.out.println("9 - even number");
        }
        if (chkNum.isEven(8)) {
            System.out.println("8 - even number");
        }
    }
}
