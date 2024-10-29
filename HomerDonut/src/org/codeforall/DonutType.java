package org.codeforall;

public enum DonutType {
    CHOCOLATE(100, 25),
    PINK (50, 10),
    CARAMEL(25, 5),
    BROCCOLI(100, -25);

    private int speed;
    private int points;

    DonutType(int speed, int points){
        this.speed = speed;
        this.points = points;
    }

}
