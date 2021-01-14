package com.home.sandbox.javaRushExamples.arraysExamples.methodsParametrsReload.artificialIntelligence;

public class ArtificialIntelligenceMain { //искусственный интелект
    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();

        jarvis.sayHi("Rik");
        jarvis.sayHi("Alex","Kate");
        jarvis.sayHi("lala", "Coll","Jina", "Alex", "Kate");
    }
}
