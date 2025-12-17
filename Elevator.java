
package edu.zuj.oop;


public class Elevator {
    private char speed;
    private int floors;

    public Elevator() {
    setSpeed('F');
    setFloors(4);    
    }

    public Elevator(char speed, int floors) {
        this.speed = speed;
        this.floors = floors;
    }

    public void setSpeed(char speed) {
       if(speed == 'F' || speed == 'S'){
        this.speed = speed;
       }else{
           System.out.println("Error");
       }
    }

    public char getSpeed() {
        return speed;
    }

    public void setFloors(int floors) {
       if(floors>=1 && floors<=20){
        this.floors = floors;
       }else{
           System.out.println("Error");
       }
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "Elevator{" + "speed=" + speed + ", floors=" + floors + " , Total Cost="+getTotalCost() +'}';
    }

   public double getSpeedCost(){
   int speedCost = 0;
   switch(speed){
       case 'F' : speedCost = 3000;break;
       case 'S' : speedCost = 1500;break;
  }
   return speedCost;
   }
    
    public double getFloorCost() {
    int floorCost =0;
    if(floors>=1 && floors<=5){
    floorCost= floors*2000;
    }else if(floors>=6 && floors<=10){
     floorCost= floors*1500;
    }else if(floors>=11 && floors<=20){
     floorCost= floors*1000;
    }
    return floorCost;
    }
    
     public double getTotalCost(){
     double totalCost=getSpeedCost()+getFloorCost()+100;
    return totalCost; 
     }
}
