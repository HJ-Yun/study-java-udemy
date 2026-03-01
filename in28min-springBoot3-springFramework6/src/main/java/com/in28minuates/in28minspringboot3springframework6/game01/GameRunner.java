package com.in28minuates.in28minspringboot3springframework6.game01;

public class GameRunner {
    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run(){
        System.out.println("Running game01 : " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }

}
