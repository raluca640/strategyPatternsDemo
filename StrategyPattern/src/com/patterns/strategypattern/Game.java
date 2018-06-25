package com.patterns.strategypattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //metoda template
    public final void play(){

        //initializarea jocului
        initialize();

        //porneste Jocul
        startPlay();

        //Sfarsit Joc
        endPlay();
    }
}
