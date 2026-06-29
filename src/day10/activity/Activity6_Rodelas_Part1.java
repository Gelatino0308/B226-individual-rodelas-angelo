
package day10.activity;

import java.util.Scanner;

public class Activity6_Rodelas_Part1 {
    
    public static void main(String[] args) {
        // initialize Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to show to its multiplication table: "); // prompts user to choose the multiplication table to display
        int multiplicationTableValue = input.nextInt(); // get number input and store in a variable
        System.out.println("\nMultiplication Table of " + multiplicationTableValue);
        
        int i = 1; // table starts with 1
        while (i <= 10) { // table ends with 10
            int product = multiplicationTableValue * i; // initializes and stores the product value for each multiplication
            System.out.println(multiplicationTableValue + " * " + i + " = " + product);
            i++; // move forwards to the next line
        }
        
        // close Scanner object to free resource
        input.close();
    }
}
