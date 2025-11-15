

package edu.zuj.oop;
import java.util.Scanner;

public class lecture4Homeworke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("\nChoose an option:");
        System.out.println("1) Add only the odd numbers");
        System.out.println("2) Add only the even numbers");
        System.out.println("3) Add only the prime numbers");
        System.out.println("4) Find the average of the odd and prime numbers");
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        int sum = 0;
        int oddSum = 0, primeSum = 0;
        int oddCount = 0, primeCount = 0;

        switch (choice) {
            case 1: // Add only odd numbers
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0)
                        sum += i;
                }
                System.out.println("Sum of odd numbers = " + sum);
                break;

            case 2: // Add only even numbers
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0)
                        sum += i;
                }
                System.out.println("Sum of even numbers = " + sum);
                break;

            case 3: // Add only prime numbers
                for (int i = 2; i <= n; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime)
                        sum += i;
                }
                System.out.println("Sum of prime numbers = " + sum);
                break;

            case 4: // Average of odd and prime numbers together
                for (int i = 1; i <= n; i++) {
                    // Check for odd numbers
                    if (i % 2 != 0) {
                        oddSum += i;
                       
                    }

                    // Check for prime numbers
                    if (i > 1) {
                        boolean isPrime = true;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            primeSum += i;
                           
                        }
                    }
                }

               
                double average = (double) primeSum / oddSum ;

                System.out.println("Average of odd and prime numbers combined = " + average);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        
    }
}