package com.home.sandbox.controlStatements;

public class ForPrimeNumberExample { //page146
    public static void main(String[] args) {
        int num = 6;
        boolean isPrime;

        if (num < 2)
            isPrime =false;
            else isPrime = true;

       // System.out.println(isPrime + " 1");

            for (int i = 2; i <= num / i; i++) {
               // System.out.println("iteration " + i);
                if ((num % i) == 0) {
                    isPrime = false;
break;
                   //System.out.println(isPrime + " 1.5");

                }
                //System.out.println(isPrime + " 2");
            }
       // System.out.println(isPrime+" 3");
            if (isPrime) {
                System.out.println("prime number");
            } else {
                System.out.println("do not prime number");
            }


        }
    }
