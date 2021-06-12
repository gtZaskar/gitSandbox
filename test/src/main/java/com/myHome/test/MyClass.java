package main.java.com.myHome.test;

public class MyClass {
    private long id;
    private String name;

    public MyClass(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        MyClass someO = (MyClass) o;
        return id==(someO.id) && name.equals(someO.name);
    }
}
