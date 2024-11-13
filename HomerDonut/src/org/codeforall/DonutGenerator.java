package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutGenerator {

    private int startPosY = -10;
    private int donutYPos = -10;
    private int donutXPos;
    private int delay = 10;
    private Picture donutImg;
    private DonutType generatedDonut;
    Game game;

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

    public Picture drawDonut(){
        DonutType generatedDonut = randomDonut();
        this.generatedDonut = generatedDonut;

        donutXPos = (438 + (int)Math.floor(Math.random()*800));

        donutImg = new Picture(donutXPos, startPosY, generatedDonut.getResource());
        donutImg.draw();

        return donutImg;
    }

    public void translate() {


        while (donutYPos < 750) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            donutImg.translate(0, generatedDonut.getSpeed());
            donutYPos = donutYPos + generatedDonut.getSpeed();
            System.out.println(donutYPos);

            }
        donutYPos = -10;
    }

    public Picture getDonutImg() {
        return donutImg;
    }

    public DonutType getGeneratedDonut() {
        return generatedDonut;
    }
}
