package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutGenerator {

    private int startYPos = -10;
    private int [] donutYPos = new int[4];
    private int []donutXPos = new int[4];
    int generationPointer;
    int donutCounter = 0;
    private boolean gameOver = false;
    private DonutType[] generatedDonut = new DonutType[4];
    private Picture[] donuts = new Picture[4];
    private CollisionDetector detector;

    public DonutType randomDonut(){

        int randomGen = (int) Math.floor(Math.random()*10);

        if (randomGen <= 4) {
            return DonutType.PINK;
        } else if (randomGen <= 6) {
            return DonutType.CARAMEL;
        } else if (randomGen <= 8) {
            return DonutType.BROCCOLI;
        }else{
            return DonutType.CHOCOLATE;
        }
    }

    public void drawDonut(int donutNum) {

        generatedDonut[donutNum] = randomDonut();

        donutXPos[donutNum] = (438 + (int) Math.floor(Math.random() * 800));

        donuts[donutNum] = new Picture(donutXPos[donutNum], startYPos, generatedDonut[donutNum].getResource());
        donuts[donutNum].draw();
        donutYPos[donutNum] = -10;
    }

        public void translate (int donutNum) {

                donuts[donutNum].translate(0, generatedDonut[donutNum].getSpeed());
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
        donutYPos[donutNum] = -500;
    }

    public int getDonutXPos(int donutNum) {
        return donutXPos[donutNum];
    }

    public int getRandomYPos(){
        return 300+ (int) Math.floor(Math.random() * 300);
    }

    public void setDetector(CollisionDetector detector) {
        this.detector = detector;
    }

    public DonutType getGeneratedDonutType(int num) {
        return generatedDonut[num];
    }

    public Picture getDonutPic(int num) {
        return donuts[num];
    }
}
