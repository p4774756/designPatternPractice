package org.example;

public class Stop implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop stat";
    }
}
