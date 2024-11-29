package org.codeforall;


public class Game {


    private int gameLevel = 100000;
    private MyKeyboardHandler keyboard;
    private DonutGenerator donutGen;
    private DonutBox box;
    private Score score;


    public void init(){
        keyboard.KeyboardHandler(box, this);
        new Background();
    }

    public void start() {
        box.donutBox();
        score.scoreDraw();
        donutGen.donutStartup();

        }

    public DonutBox getBox() {
        return box;
    }

    public void setDonutGen(DonutGenerator donutGen) {
        this.donutGen = donutGen;
    }

    public void setBox(DonutBox box) {
        this.box = box;
    }

    public void setKeyboard(MyKeyboardHandler keyboard) {
        this.keyboard = keyboard;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
