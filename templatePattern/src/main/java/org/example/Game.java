package org.example;

abstract public class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    void play() {
        // initialize the game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }
}
