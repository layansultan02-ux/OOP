package edu.zuj.oop;

import java.util.Scanner;

public class lecture3Part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = input.nextInt();
        System.out.println("Enter n2: ");
        int n2 = input.nextInt();
        System.out.println("--------------------------");
        System.out.println("1- Add");
        System.out.println("2- Sub");
        System.out.println("3- Mul");
        System.out.println("4- Div");
        System.out.println("5- Quit");
        System.out.println("--------------------------");
        System.out.println("enter your choice: ");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            case 5:
                System.out.println("Good Bye");
                break;
            default:
                System.out.println("Error");

        }
    }

}
