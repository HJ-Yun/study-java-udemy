package com.in28minuates.in28minspringboot3springframework6.game;

public class GameRunner {

    // Tight Coupling
//    private MarioGame marioGame;
//
//    public GameRunner(MarioGame marioGame) {
//        this.marioGame = marioGame;
//    }
//
//    public void run(){
//        System.out.println("Running game : " + marioGame);
//        marioGame.up();
//        marioGame.down();
//        marioGame.left();
//        marioGame.right();
//    }

    // Loose Coupling
    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole = gamingConsole;
    }

    public void run(){
        System.out.println("GamingConsole : " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
