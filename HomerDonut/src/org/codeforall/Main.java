package org.codeforall;

public class Main {
    public static void main(String[] args) {

    Game game = new Game();
    DonutGenerator donutGen = new DonutGenerator();
    CollisionDetector collisionDetector = new CollisionDetector();
    DonutBox donutBox = new DonutBox();
    MyKeyboardHandler keyboard = new MyKeyboardHandler();
    Score score = new Score();

    donutGen.setDetector(collisionDetector);
    game.setDonutGen(donutGen);
    collisionDetector.setDonGen(donutGen);
    collisionDetector.setDonutBox(donutBox);
    game.setBox(donutBox);
    keyboard.setBox(donutBox);
    game.setKeyboard(keyboard);
    game.setScore(score);
    collisionDetector.setScore(score);

    game.init();
    game.start();

    }
}
