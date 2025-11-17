
package edu.zuj.oop;

public class lecture8Test2 {
    public static void main(String[] args) {
        lecture8Test1 s1 = new lecture8Test1();
        s1.Id = 101;
        s1.name = "ata";
        s1.TotalMarks = 200;
        s1.TotalHours = 20;
        
        lecture8Test1 s2 = new lecture8Test1();
        s2.Id = 102;
        s2.name = "essa";
        s2.TotalMarks = 600;
        s2.TotalHours = 30;
        
        
        s1.printInf();
        s1.getAvg();
        System.out.println("=================");
        s2.printInf();
        s2.getAvg();
    }
 
}
