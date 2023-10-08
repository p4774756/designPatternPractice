package org.example;

public class Start implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is start state");

        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start stat";
    }
}
