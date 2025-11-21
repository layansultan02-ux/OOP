package edu.zuj.oop;

public class lecture10Part2Test1 {

    private int rad;

    public lecture10Part2Test1() {
    }

    public lecture10Part2Test1(int rad) {
        this.rad = rad;
    }

    public double calcArea() {
        double area = Math.PI * rad * rad;
        return area;
    }
    
     public double calcRound() {
        double Round = Math.PI * rad * 2;
        return Round;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if(rad>0){
        this.rad = rad;
        }else{
            System.out.println("Invalid Input");
        }
        }

    @Override
    public String toString() {
        return "Circle{rad=" + rad +", Area=" + calcArea() +", Round=" + calcRound() + '}';
    }
    
    
    }

 


