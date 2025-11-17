
package edu.zuj.oop;

public class lecture8Test1 {
    int Id;
    String name;
    int TotalMarks;
    int TotalHours;
    double Avg;
    
    public double getAvg (){
    double Avg =  TotalMarks / TotalHours;
        System.out.println("The Avg is =" + Avg);
        return Avg;
    }
    
    public void printInf () {
        System.out.println("the Id is : " + Id);
        System.out.println("the name is : " + name);
    }
}
