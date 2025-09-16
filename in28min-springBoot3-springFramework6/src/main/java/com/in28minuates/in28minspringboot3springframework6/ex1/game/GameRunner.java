package com.in28minuates.in28minspringboot3springframework6.ex1.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole gameConsole) {
        this.game = gameConsole;
    }

    public void run(){
        System.out.println("Running game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
