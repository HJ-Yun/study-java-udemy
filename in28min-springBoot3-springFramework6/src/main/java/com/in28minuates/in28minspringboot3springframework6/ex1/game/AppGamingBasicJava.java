package com.in28minuates.in28minspringboot3springframework6.ex1.game;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
//        var packmanGame = new PackManGame();
//        var gameRunner = new GameRunner(superContraGame); //need to change GameRunner Class Construction.
//        gameRunner.run();

        var game = new MarioGame();
//        var game = new SuperContraGame();
//        var game = new PackManGame();

        var gameRunner = new GameRunner(game);  // game1,2,3 is a Dependency of GameRunner
//        var gameRunner = new GameRunner(game);
//        var gameRunner = new GameRunner(game);
        gameRunner.run();

        // 1. Object Creation
        // 2. Object Creation with Interface & Wiring of Dependency


    }
}
