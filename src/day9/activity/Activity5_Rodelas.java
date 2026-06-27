
package day9.activity;

import java.util.Scanner;

public class Activity5_Rodelas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Activity 5.1 -   Summation of 1 to N
        // Task: Write a Java program that computes the sum of numbers from 1 up to N. 
        System.out.print("Enter a number for summation limit (N): ");
        int N = input.nextInt();
        System.out.println("N = " + N + "\n");
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println("Final Sum: " + sum + "\n");
        
        
        // Activity 5.2 - Product of 1 to N
        // Task: Write a Java program that computes the product of numbers from 1 up to N.  
        System.out.print("Enter a number for product limit (N): ");
        N = input.nextInt();
        System.out.println("N = " + N + "\n");
        
        long product = 1;
        for (int i = 1; i <= N; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }
        System.out.println("Final Product: " + product + "\n");
        
        
        // Activity 5.3 – Arithmetic Sequence (Sum Only)  
        // Task: Write a Java program that prints the first N terms of an arithmetic sequence and computes their sum.
        System.out.print("Enter the start number for the arithmetic sequence (sum): ");
        int startNumber = input.nextInt();
        System.out.print("Enter the number for common difference: ");
        int commonDifference = input.nextInt();
        System.out.print("Enter a number for the sequence limit (N): ");
        N = input.nextInt();
        
        System.out.println("start number = " + startNumber);
        System.out.println("common difference = " + commonDifference);
        System.out.println("N = " + N + "\n");
        
        int arithmeticSum = startNumber;
        for (int i = 1; i <= N; i++) {
            System.out.print(arithmeticSum);
            arithmeticSum += commonDifference;
        }
        
        input.close();
    }
}
