package org.codeforall;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    public Background() {
        Canvas.setMaxX(1700);
        Canvas.setMaxY(800);
        Rectangle rectangle = new Rectangle(20, 20, 1700, 800);
        rectangle.setColor(Color.BLUEHOMER);
        rectangle.draw();
        rectangle.fill();

        Picture homer = new Picture(20, 260, "src/resources/homer1.jpg");
        homer.draw();

        Rectangle rectangle1 = new Rectangle(820, 20, 900, 800);
        rectangle1.setColor(Color.BLACK);
        rectangle1.draw();

    }
}
