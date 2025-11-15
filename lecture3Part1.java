
package edu.zuj.oop;

import java.util.Scanner;

public class lecture3Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = input.nextInt();
        System.out.println("Enter n2");
        int n2 = input.nextInt();
        if(n1>n2) {
            System.out.println(n1+n1);
        } else if(n2>n1) {
            System.out.println(n2+n2);
        }else{
            System.out.println(n1+n2);
        }
    }
}
