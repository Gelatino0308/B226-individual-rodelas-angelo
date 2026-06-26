package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {

    public static void main(String[] args) {
        /* 
            Age: 0 - 12 -> Child
                Age 0-5 -> Specifically, Toddler
                Age 6-12 -> Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13-15 -> Soecifically, Early Teen
                Age: 16-19 -> Soecifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20-35 -> Soecifically, Young Adult
                Age: 36-59 -> Soecifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60-75 -> Soecifically, Young Senior
                Age: 76-120 -> Soecifically, Elderly
            Invalid Age -> Invalid Input
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Validation
        if (age >= 0 && age <= 120) {
            if (age <= 12) { // 0-12 - outer if
                System.out.println("You are a child");
                if (age <= 5) { // toddler - inner if
                    System.out.println("Specifically, you are Toddler.");
                } else {
                    System.out.println("Specifically, you are Pre-Teen.");
                }
            } else if (age <= 19) { // 13-19
                System.out.println("You are a teenager");
                if (age <= 15) { // early teen - inner if
                    System.out.println("Specifically, you are Early Teen.");
                } else {
                    System.out.println("Specifically, you are Late Teen.");
                }
            } else if (age <= 59) { // 20-59
                System.out.println("You are adult");
                if (age <= 35) { // young adult - inner if
                    System.out.println("Specifically, you are Young Adult.");
                } else {
                    System.out.println("Specifically, you are Middle-Aged.");
                }
            } else if (age <= 120) { // 60-120
                System.out.println("You are senior citizen");
                if (age <= 75) { // young senior - inner if
                    System.out.println("Specifically, you are Young Senior.");
                } else {
                    System.out.println("Specifically, you are Elderly.");
                }
            }
        } else {
            System.out.println("Invalid age entered.");
        }

        // code minimization
        input.close();
    }
}
