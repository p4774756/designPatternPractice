package org.example;

public class SingleObject {
    private static final SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getObject() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hi");
    }
}
