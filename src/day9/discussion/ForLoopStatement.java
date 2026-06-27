
package day9.discussion;

import java.util.Scanner;

public class ForLoopStatement {
    
    public static void main(String[] args) {
        // syntax
        // Print your name 10 times
//        for (int i = 0; i <= 9; i++) {
//            System.out.println(i + 1 + ": Winter");
//        }
        
//        // Mini-Activity: Calculates the product of numbers from 1-5
//        int product = 1;
//        for (int i = 1; i <= 5; i++) {
//            product *= i;
//        }
        
//        System.out.println(product);
        
        // dynamic factorial
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        
//        long product = 1;
//        for (int i = 1; i <= num; i++) {
//            product *= i;
//        }
//        
//        System.out.println("Product: " + product);
//        
        
        // print the first 5 even numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
