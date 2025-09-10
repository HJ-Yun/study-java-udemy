package com.in28minuates.in28minspringboot3springframework6;

import com.in28minuates.in28minspringboot3springframework6.game.GameRunner;
import com.in28minuates.in28minspringboot3springframework6.game.MarioGame;
import com.in28minuates.in28minspringboot3springframework6.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        // var gameRunner = new GameRunner(superContraGame); //need to change GameRunner Class Construction.
        //gameRunner.run();

    }
}
