
package edu.zuj.oop;

public class Engine {
       private int cylenders;
    private int capacity;
    private int hp;

    public Engine() {
    }

    public Engine(int cylenders, int capacity, int hp) {
        this.cylenders = cylenders;
        this.capacity = capacity;
        this.hp = hp;
    }

    public int getCylenders() {
        return cylenders;
    }

    public void setCylenders(int cylenders) {
        this.cylenders = cylenders;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engin{" + "cylenders=" + cylenders + ", capacity=" + capacity + ", hp=" + hp + '}';
    }

     public void tunrOn(){
        System.out.println("Turning on engine...");
    }
    
    public void turnOff(){
        System.out.println("Turning off engine...");
    }

}
