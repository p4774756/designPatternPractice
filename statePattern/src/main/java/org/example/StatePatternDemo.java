package org.example;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        State start = new Start();
        start.doAction(context);
        System.out.println(context.getState());

        State stop = new Stop();
        stop.doAction(context);
        System.out.println(context.getState());
    }
}
