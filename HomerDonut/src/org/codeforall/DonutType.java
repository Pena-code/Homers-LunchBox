package org.codeforall;

public enum DonutType {
    CHOCOLATE(3, 5, Game.PREFIX + "chocolate.png"),
    PINK (6, 20, Game.PREFIX + "pink.png"),
    CARAMEL(4, 10, Game.PREFIX + "caramel.png"),
    BROCCOLI(6, -20, Game.PREFIX + "broccoli.jpeg");

    private int speed;
    private int points;
    private String resource;

    DonutType (int speed, int points, String resource){
        this.speed = speed;
        this.points = points;
        this.resource = resource;
    }

    public int getSpeed() {
        return speed;
    }
    public int getPoints() {

        return points;
    }
    public String getResource() {
        return resource;
    }


}
