package main.java.com.home.sandbox.gerbertShildt2018CompleteGuideExamples.chapter7DetailedConsiderationClassesMethods.example194ArgumentsTransfer.passObjectRe;

class PassObjReMain {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call : " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after call : " + ob.a + " " + ob.b);
    }
}
