package edu.zuj.oop;

public class Tyre {

    private int width;
    private int height;
    private int diamter;

    public Tyre() {
    }

    public Tyre(int width, int height, int diamter) {
        this.width = width;
        this.height = height;
        this.diamter = diamter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiamter() {
        return diamter;
    }

    public void setDiamter(int diamter) {
        this.diamter = diamter;
    }

    @Override
    public String toString() {
        return "Tyre{" + "width=" + width + ", height=" + height + ", diamter=" + diamter + '}';
    }

    
}
