package org.codeforall;

public class CollisionDetector {

    private int boxWith = 100;
    private int boxHeight = 20;
    private int donutWith = 30;
    private int donutHeight = 30;
    private int boxYPos = 680;

    private DonutGenerator donutGen;
    private DonutBox donutBox;
    private Score score;
    private ScreenController screenController;

    public void collisionCheck(int numberOfDonuts){
        for(int i = 0; i <= numberOfDonuts; i++){
            if(donutGen.getDonutXPos(i) < donutBox.getBoxXPos() + boxWith &&
            donutGen.getDonutXPos(i)+ donutWith > donutBox.getBoxXPos() &&
            donutGen.getDonutYPos(i) < boxYPos + boxHeight &&
            donutGen.getDonutYPos(i) + donutHeight > boxYPos){
                donutGen.getDonutPic(i).delete();
                donutGen.resetDonutYPos(i);
                score.scoreUpdate(donutGen.getGeneratedDonutType(i).getPoints());
            }
            if(donutGen.getDonutYPos(i) >= 720){
                donutGen.getDonutPic(i).delete();
                donutGen.resetDonutYPos(i);
                if(donutGen.getGeneratedDonutType(i) == DonutType.PINK){
                    screenController.deleteLive();
                }
            }

        }
    }

    public void setDonGen(DonutGenerator donGen) {
        this.donutGen = donGen;
    }

    public void setDonutBox(DonutBox donutBox) {
        this.donutBox = donutBox;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public void setScreenController(ScreenController screenController) {
        this.screenController = screenController;
    }
}
