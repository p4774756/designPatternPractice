package org.example;

public class SingletonPatternDemo {

    public static void main(String[] args) {
//        SingleObject singleObject = new SingleObject();

        SingleObject singleObject = SingleObject.getObject();
        singleObject.showMessage();
    }

}
