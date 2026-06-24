
package day6.discussion;


public class LogicalOperator {
   
    public static void main(String[] args) {
        
        // Cinema Logic
        
        boolean hasTicket = true;
        boolean hasVaccinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = true;

        // (&&) May ticket -> pwede kang pumasok sa sinehan
        System.out.println("Allowed to enter cinema: " + (hasTicket && hasVaccinationCard));
        
        // (||)(student || senior citizen) -> Discounted
        System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
        
        // NOT(!) Hindi naka logged in sa app
        System.out.println("Cannot reserve seat: " + !isLoggedIn);

          // Logical &&
        
//        int num = 100;
//        int num2 = 200;
//        
//        //                  T               F
//        boolean result = num < num2 && num > num2;
//        System.out.println(result);
//        
//        //                  T               F
//        boolean result2 = num < num2 || num > num2;
//        System.out.println(result2);
//        
        /*  &&          Result
            T   T       T
            T   F       F
            F   T       F
            F   F       F
        */
        
        /* ||           Result
            T   T       T
            T   F       T
            F   T       T
            F   F       F
        */
    }
}
