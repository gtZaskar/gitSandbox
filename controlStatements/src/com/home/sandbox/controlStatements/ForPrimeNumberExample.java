package com.home.sandbox.controlStatements;

public class ForPrimeNumberExample { //page146
    public static void main(String[] args) {
        int num =5;
        boolean isPrime=false;

      if (num<2)
           isPrime =false;
       else isPrime = true;

       for (int i=2;i<=num/i;i++){
           if ((num%i)==0){
               isPrime=false;
               break;
           }
       }
       if (isPrime)
           System.out.println("prime number");
       else System.out.println("do not prime number");
           }
}
