
package edu.zuj.oop;

public class HerbsMaker extends DrinkMaker {
    private int Herb;

    public int getHerb() {
        return Herb;
    }

    public void setHerb(int Herb) {
        this.Herb = Herb;
    }
    @Override
    public String toString() {
        return "HerbsMaker{" + "Herb=" + Herb + '}';
    }

    @Override
     public void addIngredients() {
        System.out.println("adding Sugar...");
        System.out.println("adding Herbs...");
    }

   
     
}
