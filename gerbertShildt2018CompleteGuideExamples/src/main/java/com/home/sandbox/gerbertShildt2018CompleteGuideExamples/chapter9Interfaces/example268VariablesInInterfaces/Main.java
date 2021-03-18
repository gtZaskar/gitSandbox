package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example268VariablesInInterfaces;

import static main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example268VariablesInInterfaces.AskMe.answer;

public class Main {
    public static void main(String[] args) {
        Question question = new Question();

        answer(question.ask());
    }
}
