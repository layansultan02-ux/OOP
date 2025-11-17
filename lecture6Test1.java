
package edu.zuj.oop;

import java.util.Scanner;

public class lecture6Test1 {
    public static void main(String[] args) {
        int n1 = readNumber ();
        int n2 = readNumber ();
        int s = add (n1 , n2);
        System.out.println("the sum is "+s);
    }
    public static int readNumber() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter num");
        int n = input.nextInt();
        return n;
       
    }
     public static int add (int a , int b) {
    int sum = a + b ;
    return sum;
        
    }
}
