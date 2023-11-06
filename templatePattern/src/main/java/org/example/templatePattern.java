package org.example;

public class templatePattern {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        System.out.println();

        game = new Cricket();
        game.play();
    }
}