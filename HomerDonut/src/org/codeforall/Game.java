package org.codeforall;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    DonutGenerator donutGen = new DonutGenerator();
    DonutType donutType;

    private int gameLevel = 100000;
    private boolean gameOver = false;
    private MyKeyboardHandler keyboard = new MyKeyboardHandler();
    private DonutBox box;


    public void init(){
        keyboard.KeyboardHandler(box, this);
        new Background();
    }

    public void start() {
        box = new DonutBox();


        while(!gameOver){
                donutGen.drawDonut();
                donutGen.translate();

        }
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public DonutBox getBox() {
        return box;
    }
}
