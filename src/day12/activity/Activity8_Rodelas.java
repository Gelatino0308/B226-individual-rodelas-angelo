
package day12.activity;

import java.util.Scanner;

public class Activity8_Rodelas {
    
    public static void main(String[] args) {
        // initializes Scanner object to be reused for user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("        Average Calculator");
        System.out.println("===================================");
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();
        
        // uses the user input values to initialize a fixed size multi-dimensional array
        int[][] grades = new int[numStudents][numSubjects];
        // initializes single dimensional arrays for student and subject names
        String[] studentNames = new String[numStudents];
        String[] subjectNames = new String[numSubjects];
        
        input.nextLine(); // necessary to take up new line left by the previous int input's "enter"
        
        System.out.println("\nEnter subject names:");
        // prompts the user to input subject names as many as the number of subjects
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine(); // stores subject name with index corresponding to the input order
        }
        
        for (int i = 0; i < numStudents; i++) { // outer loop prompts user to input student names as many as the number of students
            System.out.println("");
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
            System.out.println("Enter grades for each subject: ");
            for (int j = 0; j < numSubjects; j++) { // inner loop cycles through subjectNames to display and prompt corresponding grade
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextInt(); // stores grade in the matching indexes of grades array
            }
            input.nextLine(); // necessary to take up new line left by the previous int input's "enter"
        }
        
        System.out.println("\n");
        System.out.println("===================================");
        System.out.println("          Grades Report");
        System.out.println("===================================");
     
        System.out.printf("%-20s", "Student"); // gives 20 spaces for Student string display and aligns it to the left
        
        // cycles through the subjectNames array to give each string 10 spaces for display and aligns it to the left
        for(String subject : subjectNames) {
            System.out.printf("%-10s", subject);
        }
        
        System.out.printf("%-10s%n", "Average"); // gives 10 spaces for Average string display and aligns it to the left
        System.out.println("-----------------------------------------------------------------------------------");
        
        // outer loop initializes sum variable for average computation later and gives the same spaces as Student header
        for (int i = 0; i < numStudents; i++) { 
            int totalGrade = 0;
            System.out.printf("%-20s", studentNames[i]);
            
            // inner loop cycles through the grade of the student to display and add it to the current sum
            for (int j = 0; j < numSubjects; j++) { 
                System.out.printf("%-10d", grades[i][j]); // uses "d" in format specifier to place integer 
                totalGrade += grades[i][j];
            }
            // average formula
            double average = totalGrade / numSubjects;
            System.out.printf("%-10.2f", average); // uses "f" in format specifier to place double
            System.out.println("");
        }
    }
}
