package bg.smg;

import javax.swing.*;

public abstract class DrawableObj{
    private int xCoord;
    private int yCoord;
    private int width;
    private int height;

    public abstract JPanel draw();

    public DrawableObj() {

    }

    public DrawableObj(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        width = width;
        height = height;
    }


    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        height = height;
    }
}
