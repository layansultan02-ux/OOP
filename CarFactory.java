
package edu.zuj.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {
         Engine e=createEngine();
        GearBox g=new GearBox();
        g.setAutomatic(true);
        g.setShifts(5);
        
        ArrayList<Wheel> wheels=createWheelArray();
        
        Car c=new Car();
        c.setType("Ford");
        c.setYear(2017);
        c.setEngine(e);
        c.setGear(g);
        c.setWheels(wheels);
        
        c.turnOn();
        c.turnOff();
        
        System.out.println(c);
    }

    public static Engine createEngine(){
        Engine engine=new Engine();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter horse power: ");
        engine.setHp(s.nextInt());
        System.out.println("Enter horse ceylenders: ");
        engine.setCylenders(s.nextInt());
        System.out.println("Enter horse capacity: ");
        engine.setCapacity(s.nextInt());
        return engine;
    }
    
    private static ArrayList<Wheel> createWheelArray() {
        ArrayList<Wheel> wheels=new ArrayList();
        for(int i=0;i<4;i++){
            Tyre tyre=new Tyre(255, 55, 17);
            Rim rim=new Rim("Alimunuim", 17, 5, 55);
            Wheel wheel=new Wheel(tyre, rim);
            wheels.add(wheel);
        }
        return wheels;
    }
}
