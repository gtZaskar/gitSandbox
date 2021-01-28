package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter6IntroductionToClasses.exampleLifeDaysCounter;

public class DaysCounter {


    //method for count how many years
    int countYears(int year, int years1) {
        int howYears = years1 - year;
        return howYears;
    }

    //method for count tall years
    int countTallDaysInYear(int year, int year1) {
        int counter =0;
        for (int i = year; i <= year1; i++) {
            if (i % 4 == 0 & i % 100 != 0) {
                counter += 1;
            }
            if (i % 4 == 0 & i % 100 == 0 & i % 400 == 0) {
                counter += 1;
            }

        }
        return counter;
    }

    //method for count how many days
    int countDays(int howYears){
       return howYears*365;
    }


}
