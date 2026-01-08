
package edu.zuj.oop;

public class CoffeeMaker extends DrinkMaker {
      private int Coffee;

    public int getCoffee() {
        return Coffee;
    }

    public void setCoffee(int Coffee) {
        this.Coffee = Coffee;
    }
   @Override
    public String toString() {
        return "CoffeeMaker{" + "Coffee=" + Coffee + '}';
    }
        
      @Override
    public void addIngredients() {
        System.out.println("adding Sugar...");
        System.out.println("adding Coffee beans...");
    }

    
     
}
