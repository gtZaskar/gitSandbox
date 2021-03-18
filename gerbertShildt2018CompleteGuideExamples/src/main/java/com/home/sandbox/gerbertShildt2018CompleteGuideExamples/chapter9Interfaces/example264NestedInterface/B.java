package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter9Interfaces.example264NestedInterface;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x>0?true:false;
    }
}
