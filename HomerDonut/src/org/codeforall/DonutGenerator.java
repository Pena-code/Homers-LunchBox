package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutGenerator {

    private int startYPos = -10;
    private int []donutYPos = new int[4];
    private int []donutXPos = new int[4];
    int generationPointer;
    int donutCounter = 0; //HERE GADDAMMIT RESET TO ZERO DAAAAH
    private boolean gameOver = false;
    private DonutType[] generatedDonut = new DonutType[4];
    private Picture[] donutPics = new Picture[4];
    private CollisionDetector detector;

    public DonutType randomDonut(){

        int randomGen = (int) Math.floor(Math.random()*10);

        if (randomGen <= 4) {
            return DonutType.CHOCOLATE;
        } else if (randomGen <= 6) {
            return DonutType.CARAMEL;
        } else if (randomGen <= 8) {
            return DonutType.BROCCOLI;
        }else{
            return DonutType.PINK;
        }
    }

    public void drawDonut(int donutNum) {

        generatedDonut[donutNum] = randomDonut();

        donutXPos[donutNum] = (438 + (int) Math.floor(Math.random() * 800));

        donutPics[donutNum] = new Picture(donutXPos[donutNum], startYPos, generatedDonut[donutNum].getResource());
        donutPics[donutNum].draw();
        donutYPos[donutNum] = -10;
    }

        public void translate (int donutNum) {

                donutPics[donutNum].translate(0, generatedDonut[donutNum].getSpeed());
                donutYPos[donutNum] += generatedDonut[donutNum].getSpeed();
        }

    public void donutStartup(){
        drawDonut(0);

        while (!gameOver) {
            generationPointer = getDonutYPos(0);
            delay();
            translate(0);
            detector.collisionCheck(0);
            if (generationPointer >= getRandomYPos()) {
                drawDonut(1);
                while (!gameOver){
                    generationPointer = getDonutYPos(1);
                    delay();
                    translate(0);
                    translate(1);
                    detector.collisionCheck(1);
                    if(generationPointer >= getRandomYPos()){
                        drawDonut(2);
                        while (!gameOver){
                            generationPointer = getDonutYPos(2);
                            delay();
                            translate(0);
                            translate(1);
                            translate(2);
                            detector.collisionCheck(2);
                            if(generationPointer >= getRandomYPos()){
                                drawDonut(3);
                                while (!gameOver){
                                    generationPointer = getDonutYPos(3);
                                    delay();
                                    translate(0);
                                    translate(1);
                                    translate(2);
                                    translate(3);
                                    detector.collisionCheck(3);
                                    if(generationPointer >= getRandomYPos()){
                                        donutRunner();
                                    }
                                }
                            }
                        }

                    }
                }

            }
        }
    }
    public void donutRunner(){
        drawDonut(donutCounter);
        while (!gameOver){
            generationPointer = getDonutYPos(donutCounter);
            delay();
            translate(0);
            translate(1);
            translate(2);
            translate(3);
            detector.collisionCheck(3);
            if(generationPointer >= getRandomYPos()){
                if(donutCounter == 3){
                    donutCounter = 0;
                    donutRunner();
                }
                else{
                    donutCounter ++;
                    donutRunner();
                }
            }
        }
    }
    public void delay(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getDonutYPos(int donutNum) {
        return donutYPos[donutNum];
    }

    public void resetDonutYPos(int donutNum) {
        donutYPos[donutNum] = -5000;
        donutXPos[donutNum] = -1000;
    }

    public int getDonutXPos(int donutNum) {
        return donutXPos[donutNum];
    }

    public int getRandomYPos(){
        return 250+ (int) Math.floor(Math.random() * 300);
    }

    public void setDetector(CollisionDetector detector) {
        this.detector = detector;
    }

    public DonutType getGeneratedDonutType(int num) {
        return generatedDonut[num];
    }

    public Picture getDonutPic(int num) {
        return donutPics[num];
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    public void resetDonutPics(){
        donutPics[0].delete();
        donutPics[1].delete();
        donutPics[2].delete();
        donutPics[3].delete();
    }
    public void resetAllDonutPos(){
        donutXPos[0] = 0; //HEEEERE
        donutXPos[1] = 0;
        donutXPos[2] = 0;
        donutXPos[3] = 0;

        donutYPos[0] = 0;
        donutYPos[1] = 0;
        donutYPos[2] = 0;
        donutYPos[3] = 0;
    }
    public void resetDonutType(){
        generatedDonut[0] = null;
        generatedDonut[1] = null;
        generatedDonut[2] = null;
        generatedDonut[3] = null;
    }

    public void setDonutCounter(int donutCounter) {
        this.donutCounter = donutCounter;
    }
}
