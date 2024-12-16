package org.codeforall;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DonutBox {
    private int boxYPos = 680;
    private int boxXPos = 800;
    private Picture boxPic = new Picture(boxXPos, boxYPos, Game.PREFIX + "donutbox.png");

    public void drawDonutBox(){
        boxPic.draw();
    }

    public void moveBoxLeft(){
        if(boxXPos > 440){
        boxPic.translate(-20, 0);
        boxXPos -= 20;
        }

    }
    public void moveBoxRight(){
        if (boxXPos < 1160) {
        boxPic.translate(20, 0);
        boxXPos += 20;
        }
    }
    public void deleteBox(){
        boxPic.delete();
    }

    public int getBoxXPos() {
        return boxXPos;
    }

}
