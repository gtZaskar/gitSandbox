package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example228KeyWordSuper.boxSuper;

public class BoxWeight extends Box {
    public double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
