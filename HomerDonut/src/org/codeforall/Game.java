package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    DonutGenerator donutGen = new DonutGenerator();
    DonutType donutType;

    private int delay = 10;
    private int gameLevel = 100000;
    private int maxObjects = 6;
    private boolean gameOver = false;
    private Picture[] donutSet = new Picture[maxObjects];


    public void init(){

        new Background();
    }

    public void start() {

        while (!gameOver) {

            for (int i = 0; i < maxObjects; i++) {
                Donut drawnDonut = donutGen.drawDonut();

                for (int j = gameLevel; j <= 0; j--) {
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    drawnDonut.getResource().translate(0, drawnDonut.getSpeed());
                }
            }
        }
    }
}
