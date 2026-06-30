
package day11.discussion;


public class SingleDimensionalArray {
    
    public static void main(String[] args) {
        // syntax for single dimensional array
        // collections of ages: 24, 43, 35, 18, 28, 25
        
        int[] ages = {24, 43, 35, 18, 28, 25};
        // Traversing an ages array using for loop and for-each loop
        
        System.out.println("Traversing using for loop: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        System.out.println("");
        System.out.println("Traversing using for-each: ");
        for (int age : ages) {
            System.out.println(age);
        }
        
//        String[] names = {"Michael", "Les", "Kent", "Ray", "Jeff"};
//        System.out.println(names.length - 1);
//        
//        // maximum index
//        
//        // Traversing an array using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        
        // Traversing an array using for each loop / enhanced for loop
//        for (String name : names) {
//            System.out.println(name);
//        }
        
        // Array Declaration with specified size only
        String[] anime = new String[5];
        
    }
}
