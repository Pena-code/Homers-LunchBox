package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    Rectangle rectangle = new Rectangle(5, 5, 1280, 720);
    Picture homer = new Picture(5, 425, Game.PREFIX + "homer1.jpg");
    Rectangle rectangle2 = new Rectangle(433, 5, 851, 719);
    Rectangle rectScore1 = new Rectangle(0, 0, 432, 160);
    Rectangle rectScore2 = new Rectangle(0, 160, 432, 140);
    Picture []lives = new Picture[3];
    private String livesPath = Game.PREFIX + "pink90.png";

    public void drawBackground() {

        rectangle.setColor(Color.BLUEHOMER);
        rectangle.fill();

        homer.draw();

        rectangle2.setColor(Color.BLACK);
        rectangle2.draw();
        rectScore1.setColor(Color.WHITE);
        rectScore1.draw();
        rectScore2.setColor(Color.WHITE);
        rectScore2.draw();
    }
    public void drawLives(){
        lives[0] = new Picture(60, 320, livesPath);
        lives[1] = new Picture(180, 320, livesPath);
        lives[2] = new Picture(300, 320, livesPath);
        lives[0].draw();
        lives[1].draw();
        lives[2].draw();
    }
    public void deleteLive(int num){
        lives[num].delete();
    }
    public void deleteBackground(){
        rectangle.delete();
        rectangle2.delete();
        homer.delete();
        rectScore1.delete();
        rectScore2.delete();
    }
}
