
package day12.discussion;

import java.util.Scanner;

public class MultiDimensionalUsingScanner {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] numbers = new int[2][5];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == 0) {
                    System.out.print("Enter an EVEN number [" + i + "][" + j + "]: ");
                }
                else {
                    System.out.print("Enter an ODD number [" + i + "][" + j + "]: ");
                }
                
                numbers[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nPrinting all the numbers:");
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.println(number);
            }
            System.out.println("");
        }
    }
}
