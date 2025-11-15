package edu.zuj.oop;

import java.util.Scanner;

public class lecture1Part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even. The double of it = " + (number * 2));
        } else {
            System.out.println("The number is odd. The square of it =" + (number * number));
        }

    }

}
