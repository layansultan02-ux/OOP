package edu.zuj.oop;

public class DrinkMaker {

    private int Water;
    private int Sugar;

    public int getWater() {
        return Water;
    }

    public void setWater(int Water) {
        this.Water = Water;
    }

    public int getSugar() {
        return Sugar;
    }

    public void setSugar(int Sugar) {
        this.Sugar = Sugar;
    }

    @Override
    public String toString() {
        return "DrinkMaker{" + "Water=" + Water + ", Sugar=" + Sugar + '}';
    }

    public void fillWater() {
        System.out.println("fillig Water...");
    }

    public void boil() {
        System.out.println("boiling Water...");
    }

    public void addIngredients() {
        System.out.println("adding Ingredients...");
    }

    public final void serve() {
        System.out.println("serving the drink. Enjoy!\n ");
    }

    public void makeDrink() {
        fillWater();
        boil();
        addIngredients();
        serve();
        System.out.println("----------------------");
    }

}
