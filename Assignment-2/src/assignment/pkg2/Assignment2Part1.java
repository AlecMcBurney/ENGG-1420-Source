package assignment.pkg2;

/**
 * Mackenzie Alec McBurney 2023/01/16 Assignment 2 part 1
 */
public class Assignment2Part1 {

    public static void main(String[] args) {
        
        //Initialize a variable to keep track if a number has multiple divisors.
        int factor;
        
        //Cycle through numbers 1 through 10000
        for (int i = 1; i <= 10000; i++) {
            factor = 0;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    factor++;
                }
            }
            if (factor == 0) {
                System.out.println(i);
            }
            
        }

    }
}
