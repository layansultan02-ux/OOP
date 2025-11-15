package edu.zuj.oop;

import java.util.Scanner;

public class lecture3Homeworke{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the shape you want:");
        System.out.println("1)  Horizontal line");
        System.out.println("2)  Vertical line");
        System.out.println("3)  Square");
        System.out.println("4)  Ascending triangle");
        System.out.println("5)  Right slant line");
        System.out.println("6)  Inverted triangle");
        System.out.println("7)  left slant line");
        System.out.println("8)  Rhombic (Diamond)");
        System.out.println("9)  Right-angled triangle");
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter the number of lines or size: ");
        int n = input.nextInt();

        switch (choice) {
            case 1:
                // Horizontal line
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                break;

            case 2:
                // Vertical line
                for (int i = 0; i < n; i++) {
                    System.out.println("*");
                }
                break;

            case 3:
                // Square
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Ascending triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 5:
                // Right slant line
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;

            case 6:
                // Inverted triangle
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 7:
                // left slant line
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                break;

            case 8:
                // Rhombic (Diamond)
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 9:
                //  Right-angled triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("your choise not right!");
        }
    }
}
