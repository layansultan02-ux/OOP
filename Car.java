package edu.zuj.oop;

import java.util.ArrayList;

public class Car {

    private String type;
    private int year;
    private Engine engine;
    private GearBox gear;
    private ArrayList<Wheel> wheels;

    public Car() {
    }

    public Car(String type, int year, Engine engine, GearBox gear, ArrayList<Wheel> wheels) {
        this.type = type;
        this.year = year;
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;
    }

    public void turnOn() {
        System.out.println("Turning on car");
        engine.tunrOn();
        gear.turnOn();
    }

    public void turnOff() {
        System.out.println("Turning off car");
        engine.turnOff();
        gear.turnOff();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGear() {
        return gear;
    }

    public void setGear(GearBox gear) {
        this.gear = gear;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", year=" + year + ", engine=" + engine + ", gear=" + gear + ", wheels=" + wheels + '}';
    }

}
