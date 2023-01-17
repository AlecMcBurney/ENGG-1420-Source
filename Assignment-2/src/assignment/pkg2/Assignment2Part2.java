/**
 * Mackenzie Alec McBurney
 * 2023/01/16
 * Assignment 2 part 2
 * Rewrite the above program using switch-case and for statements.
 */
package assignment.pkg2;

public class Assignment2Part2 {

    public static void main(String[] args) {

        // Initialze a variable to track number of factors, starting number and possible factors.
        int factor, count, divisor, remainder;

        // Cycle through numbers 1 through 10000.
        for (count = 1; count <= 10000; count++) {

            // Set factor to zero for each checked number.
            factor = 0;

            // A for loop to check for factor other than the number or one.
            for (divisor = count - 1; divisor > 1; divisor--) {

                //If there is a factor other than the number and one, count it to factor.
                remainder = count % divisor;
                switch (remainder) {
                    case 0:
                        factor++;
                }
            }

            // If there are factors other than the number and one print the prime number.
            switch (factor) {
                case 0:
                    System.out.println(count);
            }
        }
    }
}
