package org.codeforall;

public enum DonutType {
    CHOCOLATE(5, 25, "src/resources/chocolate.png"),
    PINK (2, 10, "src/resources/pink.png"),
    CARAMEL(3, 5, "src/resources/caramel.png"),
    BROCCOLI(5, -25, "src/resources/broccoli.jpeg");

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
    public int getPoints(DonutType donut) {

        return donut.points;
    }
    public String getResource() {
        return resource;
    }


}
