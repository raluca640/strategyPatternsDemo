package com.patterns.strategypattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Fazan();
        game.play();
        System.out.println();
        game = new Tomapan();
        game.play();
    }
}

