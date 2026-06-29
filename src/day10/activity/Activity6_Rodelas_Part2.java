
package day10.activity;


public class Activity6_Rodelas_Part2 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) { // outer loop cycles through each num from 1-10 to show their corresponding table
            System.out.println("Multiplication Table of " + i); // table header display every start of a new table display
            for (int j = 1; j <= 10; j++) { // inner loop cycles through the mulriplier from 1-10
                int product = i * j; // initializes and stores the product value for each multiplication
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println("");
        }
    }
}
