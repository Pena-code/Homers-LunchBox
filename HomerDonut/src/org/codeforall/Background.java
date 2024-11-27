package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    public Background() {
        Canvas.setMaxX(1280);
        Canvas.setMaxY(720);
        Rectangle rectangle = new Rectangle(5, 5, 1280, 720);
        rectangle.setColor(Color.BLUEHOMER);
        rectangle.draw();
        rectangle.fill();

        Picture homer = new Picture(5, 425, "src/resources/homer1.jpg");
        homer.draw();

        Rectangle rectangle1 = new Rectangle(433, 5, 851, 719);
        rectangle1.setColor(Color.BLACK);
        rectangle1.draw();
    }
}
