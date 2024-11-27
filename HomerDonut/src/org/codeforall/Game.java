package org.codeforall;


public class Game {


    private int gameLevel = 100000;
    private MyKeyboardHandler keyboard = new MyKeyboardHandler();
    private DonutGenerator donutGen = new DonutGenerator();
    private DonutBox box;


    public void init(){
        keyboard.KeyboardHandler(box, this);
        new Background();
    }

    public void start() {
        box = new DonutBox();
        donutGen.donutStartup();


        }

    public int getGameLevel() {
        return gameLevel;
    }

    public DonutBox getBox() {
        return box;
    }
}
