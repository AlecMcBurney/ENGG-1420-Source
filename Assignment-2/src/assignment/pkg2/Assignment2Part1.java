/**
 * Mackenzie Alec McBurney
 * 2023/01/16
 * Assignment 2 part 1
 * Implement a program that calculates and prints prime numbers less than 10,000 (use the if-else and
 * while statements).
 */
package assignment.pkg2;

public class Assignment2Part1 {

    public static void main(String[] args) {

        // Initialze a variable to track number of factors, starting number and possible factors.
        int factor, count, divisor;

        //Start the count at 1.
        count = 1;

        // Cycle through numbers 1 through 10000.
        while (count <= 10000) {

            // Set factor to zero for each checked number.
            factor = 0;

            // A while loop to check for factor other than the number or one.
            divisor = count - 1;
            while (divisor > 1) {

                //If there is a factor other than the number and one, count it to factor.
                if (count % divisor == 0) {
                    factor++;
                }
                divisor--;
            }

            // If there are factors other than the number and one, print the prime number.
            if (factor == 0) {
                System.out.println(count);
            }
            count++;
        }

    }
}
