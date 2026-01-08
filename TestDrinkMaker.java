package edu.zuj.oop;

public class TestDrinkMaker {

    public static void main(String[] args) {
        TeaMaker tm = new TeaMaker();
        tm.setWater(1);
        tm.setSugar(250);
        tm.setTea(10);
        tm.makeDrink();

        CoffeeMaker cm = new CoffeeMaker();
        cm.setWater(1);
        cm.setSugar(250);
        cm.setCoffee(500);
        cm.makeDrink();
        
        HerbsMaker hm = new HerbsMaker();
        hm.setWater(1);
        hm.setSugar(250);
        hm.setHerb(500);
        hm.makeDrink();
    }

}
