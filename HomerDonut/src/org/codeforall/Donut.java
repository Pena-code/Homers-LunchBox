package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Donut {

    private int speed;
    private int points;
    private String resource;
    DonutType donut;


    public Donut(DonutType donut){
        this.donut = donut;
        speed = donut.getSpeed();
        points = donut.getPoints(donut);
        resource = donut.getResource();

    }
    public int getSpeed() {
        return speed;
    }

    public String getResource() {
        return resource;
    }
}
