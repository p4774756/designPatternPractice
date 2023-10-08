package org.example;

public class Context {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
