package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter8Extends.example232createMultilevelHierarchy;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        this.weight = m;
    }

}
