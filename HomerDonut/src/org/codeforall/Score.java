package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {

    private int score = 0;
    private String scoreStr = Integer.toString(score);

    Text scoreView = new Text(50, 50, scoreStr);

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
        scoreView.grow(15, 20);
        scoreView.draw();
    }
}
