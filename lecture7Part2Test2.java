
package edu.zuj.oop;

public class lecture7Part2Test2 {
    public static void main(String[] args) {
        lecture7Part2Test1 E1 = new lecture7Part2Test1 ();
        E1.name = "Ata";
        E1.salary = 200;
        
         lecture7Part2Test1 E2 = new lecture7Part2Test1 ();
        E2.name = "Essa";
        E2.salary = 300;
        
        
        E1.SaySalary();
        System.out.println("========================");
        E2.SaySalary();
    }
}
