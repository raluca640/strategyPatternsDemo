package com.patterns.strategypattern;

public class Fazan extends Game {
    @Override
    void endPlay() {
  //      System.out.println("Fazan Game Finished!");
    	TextFormatter formatter2 = new LowerTextFormatter();
    	TextEditor editor2 = new TextEditor(formatter2);
		editor2.publishText("Fazan Game Finished!");
    }

    @Override
    void initialize() {
 //       System.out.println("Fazan Game Initialized! Start playing.");
    	TextFormatter formatter3 = new LowerTextFormatter();
    	TextEditor editor3 = new TextEditor(formatter3);
		editor3.publishText("Fazan Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
//        System.out.println("Fazan Game Started. Enjoy the game!");
    	TextFormatter formatter4 = new LowerTextFormatter();
    	TextEditor editor4 = new TextEditor(formatter4);
		editor4.publishText("Fazan Game Started. Enjoy the game!");
    }
}
