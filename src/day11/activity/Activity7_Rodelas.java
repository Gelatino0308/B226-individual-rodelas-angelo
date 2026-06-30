
package day11.activity;

import java.util.Scanner;

public class Activity7_Rodelas {
    
    public static void main(String[] args) {
        // initialize Scanner object for user input
        Scanner input = new Scanner(System.in);
        // initialize a single dimensional array with fixed size
        int numbers[] = new int[5]; 
        
        // Prompts and asks for user input 5 times 
        System.out.println("== Enter 5 numbers ==");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": "); // specifies adding 1 to i to display correct number order
            numbers[i] = input.nextInt(); // stores each input to the corresponding index in the array
        }
        
        // displays all the user input by cycling through the array
        System.out.println("\nYou entered: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // cycles through the array to add each encountered value to the sum variable
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = sum / numbers.length; // gets average by dividing the total sum with the amoung of numbers
        
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        
        // Stretch Goal
        // Initializes variables with the first value in the array
        int highestNum = numbers[0];
        int lowestNum = numbers[0];
        
        // cycles through the array to check if each value can replace the current highest and lowest numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestNum) {
                highestNum = numbers[i];
            }
            
            if (numbers[i] < lowestNum) {
                lowestNum = numbers[i];
            }
        }
        
        System.out.println("\n== Stretch Goal Outputs ==");
        System.out.println("Highest Number: " + highestNum);
        System.out.println("Lowest Number: " + lowestNum);
    }
}
