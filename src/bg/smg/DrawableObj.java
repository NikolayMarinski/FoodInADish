package bg.smg;

public abstract class DrawableObj{
    private int xCoord;
    private int yCoord;
    private int Width;
    private int Height;

    public abstract void draw();

    public DrawableObj() {
        this.xCoord = 0;
        this.yCoord = 0;
        Width = 0;
        Height = 0;
    }

    public DrawableObj(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Width = width;
        Height = height;
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
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
