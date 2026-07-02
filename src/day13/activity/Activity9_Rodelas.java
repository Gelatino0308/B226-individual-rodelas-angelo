
package day13.activity;

import java.util.Scanner;

public class Activity9_Rodelas {
    
    public static void main(String[] args) {
        
        /* 
            contains()
            Description: Checks if a string contains a specific sequence of characters anywhere inside it. 
                         Returns true if it finds it, and false if it does not.
        */
        String message = "The guy carries oranges.";
        String codeWord = "orange";
        System.out.println("== contains() output ==");
        System.out.println("Does the message mentions the code word? " + message.contains(codeWord));
        
        /*
            endsWith()
            Description: Tests if this string ends with the specified suffix.
        */
        String weight = "1000 kg";
        System.out.println("\n== endsWith() output ==");
        System.out.println("Does the weight uses the unit pounds? " + weight.endsWith("lbs"));
        
        /* 
            startsWith()
            Description: Tests if this string starts with the specified prefix.
        */
        String url = "http://www.totallynotsuspicioussite.com";
        System.out.println("\n== startsWith() output ==");
        System.out.println("Is the website secure: " + url.startsWith("https"));
        
        /*
            indexOf()
            Description: Searches for a specific character or substring and returns the index of where it first appears in the string. 
                         If it cannot find it, it returns -1.
        */
        String email = "someone@gmail.com";
        System.out.println("\n== indexOf() output ==");
        System.out.println("What index of the email does '@' occured: " + email.indexOf("@"));
        
        /* 
            isEmpty()
            Description: Returns true if, and only if, String.length() is 0.
        */
        String comment = "";
        System.out.println("\n== isEmpty() output ==");
        
        if (comment.isEmpty()) {
            System.out.println("Please leave a comment.");
        }
        else {
            System.out.println("Comment noted.");
        }
        
        /*
            trim()
            Description: Returns a copy of the string with all the whitespace (such as spaces, tabs, or newlines) 
                         removed from the very beginning and the very end. It does not remove spaces between words.
        */
        String fullName = "Angelo Rodelas ";
        System.out.println("\n== trim() output ==");
        System.out.println("Cleaned Name Format: \"" + fullName.trim() + "\"");
        
        /* 
            replace()
            Description: Returns a new string where all occurrences of a specified character or 
                         substring are replaced with a new character or substring.
        */
        String chat = "GG nub";
        System.out.println("\n== replace() output==");
        System.out.println("Filtered chat: " + chat.replace("nub", "friend"));
        
        /* 
            toCharArray()
            Description: Converts string to a new character array.
        */
        String word = "MISSISSIPPI";
        char[] wordSpelling = word.toCharArray();
        
        System.out.println("\n== toCharArray() output ==");
        for (char letter : wordSpelling) {
            System.out.println(letter);
        }
        
        /*
            nextLine().charAt()
            Description: Gets the character at the specified index of the string input.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("\n== nextLine().charAt() output ==");
        System.out.println("Available T-shirt Sizes");
        System.out.println("\t[S] Small");
        System.out.println("\t[M] Medium");
        System.out.println("\t[L] Large");
        System.out.print("Enter T-shirt size to order: ");
        char orderSize = input.nextLine().toUpperCase().charAt(0);
        
        if (orderSize == 'S') {
            System.out.println("You ordered Small T-shirt.");
        }
        else if (orderSize == 'M') {
            System.out.println("You ordered Medium T-shirt.");
        }
        else if (orderSize == 'L') {
            System.out.println("You ordered Large T-shirt.");
        }
        else {
            System.out.println("That size is not available.");
        }
        
        input.close();
        
        /*
            valueOf()
            Description: Returns the string representation of the almost any non-String data type and Object argument.
        */
        char[] acronym = {'T', 'E', 'S', 'D', 'A'};
        System.out.println("\n== valueOf() output ==");
        System.out.println("The acronym for Technical Education and Skills Development Authority is: " + String.valueOf(acronym));
        
        
        // Stretch Goal
        String country = "Philippines";  
        
        System.out.println("\n== Stretch Goal Output ==");
        System.out.println("The first character of the string is: " + country.charAt(0));
        System.out.println("The last character of the string is: " + country.charAt(country.length() - 1));
        
        int countP = 0;
        for (int i = 0; i < country.length(); i++) {
            if (String.valueOf(country.charAt(i)).equalsIgnoreCase("p")) {
                countP++;
            }
        }
        System.out.println("The character P/p appeared " + countP + " times.");
        
        int totalVowelCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < country.length(); i++) {
            for(char vowel : vowels) {
                if (country.charAt(i) == vowel) {
                    totalVowelCount++;
                }
            }
        }
        System.out.println("The total number of vowels in the string is: " + totalVowelCount);
    }
}
