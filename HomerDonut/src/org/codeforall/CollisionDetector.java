package org.codeforall;

public class CollisionDetector {

    private int boxWith = 110;
    private int boxHeight = 30;
    private int donutWith = 30;
    private int donutHeight = 45;
    private int boxYPos = 690;

    private DonutGenerator donutGen;
    private DonutBox donutBox;
    private Score score;

    public void collisionCheck(int numberOfDonuts){
        for(int i = 0; i <= numberOfDonuts; i++){
            if(donutGen.getDonutXPos(i) < donutBox.getBoxXPos() + boxWith &&
            donutGen.getDonutXPos(i)+ donutWith > donutBox.getBoxXPos() &&
            donutGen.getDonutYPos(i) < boxYPos + boxHeight &&
            donutGen.getDonutYPos(i) + donutHeight > boxYPos){
                System.out.println("Collision detected. Donut name: " + donutGen.getGeneratedDonutType(i).name() + " You get " + donutGen.getGeneratedDonutType(i).getPoints() + " points");
                donutGen.getDonutPic(i).delete();
                donutGen.resetDonutYPos(i);
                score.scoreUpdate(donutGen.getGeneratedDonutType(i).getPoints());
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
}
