
package day9.activity;

import java.util.Scanner;

public class Activity5_Rodelas {
    
    public static void main(String[] args) {
        // instantiation of Scanner object to be reused for each activity
        Scanner input = new Scanner(System.in);
        
        // Activity 5.1 -   Summation of 1 to N
        // Task: Write a Java program that computes the sum of numbers from 1 up to N. 
        System.out.println("ACTIVITY 5.1");
        System.out.print("Enter a number for summation limit (N): ");
        int N = input.nextInt();
        System.out.println("");
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
        System.out.println("Final Sum: " + sum + "\n");
        
        
        // Activity 5.2 - Product of 1 to N
        // Task: Write a Java program that computes the product of numbers from 1 up to N.  
        System.out.println("ACTIVITY 5.2");
        System.out.print("Enter a number for product limit (N): ");
        N = input.nextInt();
        System.out.println("");
        
        long product = 1; // used long to avoid negative values for large numbers
        for (int i = 1; i <= N; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }
        System.out.println("Final Product: " + product + "\n");
        
        
        // Activity 5.3 – Arithmetic Sequence (Sum Only)  
        // Task: Write a Java program that prints the first N terms of an arithmetic sequence and computes their sum.
        System.out.println("ACTIVITY 5.3");
        System.out.print("Enter the start number for the arithmetic sequence (sum): ");
        int startNumber = input.nextInt();
        System.out.print("Enter the number for common difference: ");
        int commonDifference = input.nextInt();
        System.out.print("Enter a number for the sequence limit (n): ");
        int n = input.nextInt();
        System.out.println("");
        
        int arithmeticSum = startNumber; // initialized with startNumber since the loop will not add it
        int term = startNumber;
        System.out.print(term);
        
        for (int i = 1; i < n; i++) { // used < instead of <= since the first term is already printed
            term += commonDifference;
            System.out.print(" + " + term);
            arithmeticSum += term;
        }
        System.out.println(" = " + arithmeticSum + "\n");
        
        
        // Activity 5.4 – Arithmetic Sequence (Sum and Product)  
        // Task: Write a Java program that prints the first N terms of an arithmetic sequence, shows the process, and computes both sum and product. 
        System.out.println("ACTIVITY 5.4");
        System.out.print("Enter the start number for the arithmetic sequence (sum & product): ");
        startNumber = input.nextInt();
        System.out.print("Enter the number for common difference: ");
        commonDifference = input.nextInt();
        System.out.print("Enter a number for the sequence limit (n): ");
        n = input.nextInt();
        System.out.println("");
        
        arithmeticSum = startNumber;
        long arithmeticProduct = startNumber;
        term = startNumber;
        String arithmeticSumLine = "Sum: " + term; // created separate variables for sum and product display to use only one loop
        String arithmeticProductLine = "Product: " + term;
        
        for (int i = 1; i < n; i++) {
            term += commonDifference;
            arithmeticSumLine += " + " + term;
            arithmeticProductLine += " * " + term;
            arithmeticSum += term;
            arithmeticProduct *= term;
        }
        System.out.println(arithmeticSumLine + " = " + arithmeticSum);
        System.out.println(arithmeticProductLine + " = " + arithmeticProduct);
        
        input.close();
    }
}
