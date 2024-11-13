package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutBox {
    private Picture boxPic;
    private int boxYPos = 690;
    private int boxXPos = 800;

    public DonutBox(){
        boxPic = new Picture(boxXPos, boxYPos, "src/resources/donutbox.png");
        boxPic.draw();
    }

    public void moveBoxLeft(){
        boxPic.translate(-20, 0);
        boxXPos -= 20;

    }
    public void moveBoxRight(){
        boxPic.translate(20, 0);
        boxXPos += 20;
    }

    public int getBoxXPos() {
        return boxXPos;
    }

    public int getBoxYPos() {
        return boxYPos;
    }
}
