package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Canvas;

public class ScreenController {

    private Menu menu;
    private Background background;
    private Game game;
    private DonutGenerator donutGen;

    public void setCanvas() {
        Canvas.setMaxX(1280);
        Canvas.setMaxY(720);
    }

    public void showMenu(){
        menu.drawMenu();
    }

    public void showBackground(){
        background.drawBackground();
    }

    public void deleteMenu(){
        menu.deleteMenu();
    }

    public void drawLives(){
        background.drawLives();
    }
    public void deleteLive(){
        background.deleteLive(game.getLives());
        game.setLives(game.getLives() -1);
        if(game.getLives() < 0){
            donutGen.setGameOver(true);
            game.setGameStage(0);
            game.gameOver();
        }
    }
    public void drawGameOver(){
        menu.drawGameOver();
    }
    public void deleteBackground(){
        background.deleteBackground();
    }
    public void deleteGameOver(){
        menu.deleteGameOver();
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setDonutGen(DonutGenerator donutGen) {
        this.donutGen = donutGen;
    }
}
