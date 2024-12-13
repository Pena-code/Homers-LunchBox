package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {

    private Rectangle rectangle = new Rectangle(5, 5, 1280, 720);
    private Picture homerMenu = new Picture(800, 250, Game.PREFIX + "homermenu.png");
    private Picture logo = new Picture(250, 25, Game.PREFIX + "Logo.png");
    private Picture instructions = new Picture(500, 290, Game.PREFIX + "instructions.png");
    private Picture text = new Picture(50, 350, Game.PREFIX + "text.png");
    private Picture pinkDonut = new Picture(780, 450, Game.PREFIX + "pink.png");
    private Picture gameOver = new Picture(620, 200, Game.PREFIX + "gameover.png");
    private Picture restart = new Picture(655, 450, Game.PREFIX + "restartimg.png");
    private Rectangle yellowRectangle = new Rectangle(50, 350, 400, 300);


    public void drawMenu(){
        rectangle.setColor(Color.BLUEHOMER);
        rectangle.draw();
        rectangle.fill();
        homerMenu.draw();
        logo.draw();
        instructions.draw();
        text.draw();
        pinkDonut.draw();
        yellowRectangle.setColor(Color.YELLOW);
        yellowRectangle.draw();

    }
    public void deleteMenu(){
        homerMenu.delete();
        rectangle.delete();
        pinkDonut.delete();
        text.delete();
    }
    public void drawGameOver(){
        gameOver.draw();
        restart.draw();
    }
    public void deleteGameOver(){
        gameOver.delete();
        restart.delete();
    }

}
