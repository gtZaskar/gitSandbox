package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example211ClassString;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String();
        str1 = "Hello";
        String str2 = "java is a best language, when he know this";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.equals(str2));
        System.out.println(str2.charAt(10));

        System.out.println("****************");

        String[] str3 = {"one", "two", "three"};

        for (int i =0; i<str3.length; i++){
            System.out.println(str3[i]);
        }




    }
}
