package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {

    private int growIndex = 0;
    private int score = 0;
    private int highScore = 0;
    private String scoreStr = Integer.toString(score);
    private String highScoreStr = Integer.toString(highScore);


    Text scoreView = new Text(80, 110, scoreStr);
    Text highScoreView = new Text(100, 245, highScoreStr);
    Text scoreText = new Text(100, 60, "SCORE");
    Text highScoreText = new Text(100, 190, "HIGHSCORE");

    public void scoreUpdate(int value){
        score += value;
        if(score < 0){
            score = 0;
        }
        scoreStr = Integer.toString(score);
        scoreView.setText(scoreStr);
    }
    public void scoreDraw(){
        scoreView.setColor(Color.WHITE);
        highScoreText.setColor((Color.WHITE));
        scoreText.setColor(Color.WHITE);
        highScoreView.setColor(Color.WHITE);
        scoreView.draw();
        highScoreText.draw();
        scoreText.draw();
        highScoreView.draw();
            if(growIndex == 0){
            scoreView.grow(20, 25);
            highScoreText.grow(50,25);
            scoreText.grow(40, 25);
            highScoreView.grow(20, 25);
            growIndex = 1;
            }
    }
    public void scoreDelete(){
        scoreView.delete();
    }

    public void resetScore() {
        score = 0;
        String reset = "0";
        scoreView.setText(reset);
        highScoreText.delete();
        scoreText.delete();
        highScoreView.delete();
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getHighScore() {
        return highScore;
    }
    public void setHighScore(int highScore) {
        this.highScore = highScore;
        String hsToStr = Integer.toString(highScore);
        highScoreView.setText(hsToStr);
    }
}
