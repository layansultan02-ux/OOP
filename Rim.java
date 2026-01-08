
package edu.zuj.oop;

public class Rim {
    private String material;
    private int diamter;
    private int screws;
    private int width;

    public Rim() {
    }

    public Rim(String material, int diamter, int screws, int width) {
        this.material = material;
        this.diamter = diamter;
        this.screws = screws;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDiamter() {
        return diamter;
    }

    public void setDiamter(int diamter) {
        this.diamter = diamter;
    }

    public int getScrews() {
        return screws;
    }

    public void setScrews(int screws) {
        this.screws = screws;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rim{" + "material=" + material + ", diamter=" + diamter + ", screws=" + screws + ", width=" + width + '}';
    }
    
}
