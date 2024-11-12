package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutGenerator {

    private int posY = -10;
    private Picture donutImg;
    private DonutType generatedDonut;
    private Donut donut;

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


    public Donut drawDonut(){
        DonutType generatedDonut = randomDonut();
        Donut donut = new Donut(generatedDonut);
        this.generatedDonut = generatedDonut;

        int randomDonutPos = (840 + (int)Math.floor(Math.random()*800));
        this.posY = posY;

        Picture donutImg = new Picture(randomDonutPos, posY, generatedDonut.getResource());
        donutImg.draw();
        this.donutImg = donutImg;

        return donut;
    }

    public Picture getDonutImg() {
        return donutImg;
    }

    public DonutType getGeneratedDonut() {
        return generatedDonut;
    }
}
