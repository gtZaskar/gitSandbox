package main.java.com.home.gerbertShildt2019Examples.chapter5DataTypesAndOperators.example197String;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер интернета!";
        String str2 = new String(str1);
        String str3 = "Строки в Java эффективны!";
        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());
        System.out.println("Длина str2: " + str2.length());
        System.out.println("Длина str3: " + str3.length());

        //отображение строки посимвольно
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + "\t");
        }
        System.out.println();

        if (str1.equals(str2)) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 == str3");
        } else {
            System.out.println("str1 != str3");
        }

        result = str1.compareTo(str3);
        if (result==0){
            System.out.println("str1==str3");
        }else {
            if (result<0){
                System.out.println("str1<str3");
            }else {
                if (result>0){
                    System.out.println("str1>str3");
                }
            }
        }
        //присваивание переменной str2 новой строки
        str2 = "One two three";
        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);
    }
}
