
package day7.activity;

// class import
import java.util.Scanner;

public class Activity4_Rodelas {
    
    public static void main(String[] args) {
        // instantiation of Scanner object
        Scanner input = new Scanner(System.in);
        
        // game menu display
        System.out.println("=== Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        
        // user num input storage
        int num = input.nextInt();
        
        // conditional displays based on user input
        if (num == 1) {
            System.out.println("\nYou selected Option 1: Start Game");
        }
        else if (num == 2) {
            System.out.println("\nYou selected Option 2: Load Game");
        }
        else if (num == 3) {
            System.out.println("\nYou selected Option 3: Settings");
        }
        else if (num == 4) {
            System.out.println("\nYou selected Option 4: Exit");
        }
        else {
            System.out.println("\nInvalid choice. Please try again.");
        }
    }
}
