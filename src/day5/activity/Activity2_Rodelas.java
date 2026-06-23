
package day5.activity;

public class Activity2_Rodelas {
    
    public static void main (String[] args) {
        // variable initialization
        
        double income = 50000;  
        double foodAllowance = 15000;
        double transportation = 2500;  
        double rent = 4500;  
        double utilityBill = 3500; 
        
        // income display
        System.out.printf("Income: %.0f\n", income);
        
        // expenses percentage calculation and display 
        System.out.printf("Food Allowance: %.1f %%\n", foodAllowance / income * 100);
        System.out.printf("Transportation: %.1f %%\n", transportation / income * 100);
        System.out.printf("Rent: %.1f %%\n", rent / income * 100);
        System.out.printf("Utility Bill: %.1f %%\n", utilityBill / income * 100);
        
        // sum of expenses calculation
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        
        // remaining balance calculation and display
        System.out.printf("Remaining Balance: %.0f\n", income - totalExpenses);
    }
}
