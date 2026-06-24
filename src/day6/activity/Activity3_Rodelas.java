
package day6.activity;

public class Activity3_Rodelas {
    
    public static void main(String[] args) {
        
        // Using the logical AND operator (&&), determine if the person is allowed to enter an event
        int age = 20;
        boolean hasValidID = true;
        
        System.out.println((age > 18 && hasValidID) ? "Access Granted" : "Access Denied");
        
        // Using the logical OR operator (||), determine if there are no classes today.
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        System.out.println((isWeekend || isHoliday) ? "No Classes Today" : "There is Classes Today");
        
        // Use the ternary operator (? :) to determine if the student passed or failed.  
        int score = 85;
        
        System.out.println((score >= 75) ? "Passed" : "Failed");
        
        // Use the ternary operator (? :) to determine the larger number.
        int num1 = 10;
        int num2 = 25;
        
        System.out.println("The larger number is: " + ((num1 > num2) ? num1 
                                                    : (num1 < num2) ? num2 
                                                    : "None. Both numbers are equal."));
        
        // Stretch Goal: Create a program that can identify if the number is odd or even
        System.out.println("\nStretch Goal Output:");
        int numInput = 67;
        
        String oddOrEven = (numInput % 2 == 0) ? "even": "odd";
        System.out.println("The number " + numInput + " is an " + oddOrEven + " number.");
    }
}
