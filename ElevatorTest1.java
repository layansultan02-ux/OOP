
package edu.zuj.oop;

import java.util.Scanner;

public class ElevatorTest1 {
    public static void main(String[] args) {
        Elevator arr[]= new Elevator[4];
        fill(arr);
         printArray(arr);
    }
    
    public static void printArray(Elevator arr[]){
    for(int i=0;i<arr.length;i++){
    if(arr[i].getSpeed()== 'F'){
        System.out.println(arr[i]);
    }
    }
       }
    
      public static void fill(  Elevator arr[]){
          Scanner input = new Scanner(System.in);
          for(int i=0;i<arr.length;i++){
          arr[i]=new Elevator();
              System.out.println("Enter floors (1-20)");
          arr[i].setFloors(input.nextInt());
              System.out.println("Enter speed (S,F)");
          arr[i].setSpeed(input.next().charAt(0));
          
          }
      
      }
}
