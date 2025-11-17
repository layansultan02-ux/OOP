
package edu.zuj.oop;

public class lecture7Part1Test2 {
    public static void main(String[] args) {
        lecture7Part1Test1 p1 = new lecture7Part1Test1 ();
        p1.name = "Ata";
        p1.age = 15;
        
        lecture7Part1Test1 p2 = new lecture7Part1Test1 ();
        p2.name = "Essa";
        p2.age = 20;
        
        p1.talk();
        p1.eat();
        System.out.println("================");
        p2.talk();
        p2.eat();
    }
}
