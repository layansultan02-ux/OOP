
package edu.zuj.oop;


public class lecture10Part2Test2 {
    public static void main(String[] args) {
        lecture10Part2Test1 Circles[] = new lecture10Part2Test1[10];
        for(int i=0;i<Circles.length;i++) {
        Circles[i] = new lecture10Part2Test1(i+1);
        }
        for(int i=0;i<Circles.length;i++) {
            System.out.println(Circles[i]);
        }
    }
 
}
