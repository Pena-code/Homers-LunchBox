package org.codeforall;

public class Game {
    private DonutGenerator donutGen;
    private DonutBox box;
    private Score score;
    private ScreenController screenController;
    private FileManager fileManager;
    public static final String PREFIX = "src/resources/";
    private int lives = 2;

    private int gameStage = 0;

    public void init(){

        screenController.setCanvas();
        screenController.showMenu();
        gameStageSelector();
    }

    public void gameStageSelector(){
        while (true){
            System.out.println();
            if(gameStage == 1){
                screenController.deleteMenu();
                start();
            }
            if(gameStage == 2){
                System.exit(0);
            }
        }
    }

    public void start() {
        screenController.showBackground();
        screenController.drawLives();
        box.drawDonutBox();
        score.setHighScore(fileManager.loadHighScore());
        score.scoreDraw();
        donutGen.donutStartup();
        }

    public void gameOver(){
        screenController.drawGameOver();
        if(score.getScore() > score.getHighScore()){
            score.setHighScore(score.getScore());
            String scr = Integer.toString(score.getScore());
            fileManager.saveHighScore(scr);
        }
        while (true){
            System.out.println();
            if(gameStage == 1){
                screenController.deleteGameOver();
                screenController.deleteBackground();
                box.deleteBox();
                score.resetScore();
                score.scoreDelete();
                donutGen.setGameOver(false);
                donutGen.resetDonutPics();
                donutGen.resetAllDonutPos();
                donutGen.resetDonutType();
                donutGen.setDonutCounter(0);
                lives = 2;
                break;
            }
            if(gameStage == 2){
                System.exit(0);
            }
        }
        start();
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

    public void setScore(Score score) {
        this.score = score;
    }

    public void setScreenController(ScreenController screenController) {
        this.screenController = screenController;
    }

    public void setGameStage(int gameStage) {
        this.gameStage = gameStage;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }
}
