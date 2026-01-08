package edu.zuj.oop;

public class TeaMaker extends DrinkMaker {

    private int Tea;

    public int getTea() {
        return Tea;
    }

    public void setTea(int Tea) {
        this.Tea = Tea;
    }
 @Override
    public String toString() {
        return "TeaMaker{" + "Tea=" + Tea + '}';
    }
    @Override
    public void addIngredients() {
        System.out.println("adding Sugar...");
        System.out.println("adding Tea...");
    }

   

}
