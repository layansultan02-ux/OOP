package edu.zuj.oop;

import java.util.Scanner;

public class lecture5Homeworke {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Size of the arrey");
        int Size = input.nextInt();
        int numbers[] = new int[Size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < Size; i++) {
            numbers[i] = input.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        int primeCount = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (isPrime(n)) {
                primeCount++;
            }
        }
        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];
        int[] primes = new int[primeCount];

        int e = 0, o = 0, p = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                evens[e++] = n;
            } else {
                odds[o++] = n;
            }
            if (isPrime(n)) {
                primes[p++] = n;
            }
        }
        System.out.print("\nEven numbers: ");
        printArray(evens);

        System.out.print("Odd numbers: ");
        printArray(odds);

        System.out.print("Prime numbers: ");
        printArray(primes);

        System.out.print("main numbers: ");
        printArray(numbers);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
