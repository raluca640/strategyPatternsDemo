package com.patterns.strategypattern;

public class Tomapan extends Game {
    @Override
    void endPlay() {
    	TextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Tomapan Game Finished");
    }

    @Override
    void initialize() {
    	TextFormatter formatter1 = new CapTextFormatter();
		TextEditor editor1 = new TextEditor(formatter1);
		editor1.publishText("Tomapan Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        TextFormatter formatter1 = new CapTextFormatter();
		TextEditor editor1 = new TextEditor(formatter1);
		editor1.publishText("Tomapan Game Started. Enjoy the game!");
    }
}
