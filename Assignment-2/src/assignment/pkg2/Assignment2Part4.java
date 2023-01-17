/**
 * Mackenzie Alec McBurney
 * 2023/01/17
 * Assignment 2 part 4
 * Implement a program that calculates the sum of numbers entered by the user until user enters zero (use
 * while and break statement).
 */
package assignment.pkg2;

import javax.swing.JOptionPane;

public class Assignment2Part4 {

    public static void main(String[] args) {

        //Initialize variables to create a sum of numbers.
        int num, sum;
        String numS;

        // Declare num as 1 to start the while loop. Can be any number other than 0.
        num = 1;

        // Declare sum as 0 in case no num is entered to be added.
        sum = 0;

        // A loop to ask the user for one number at a time to sum together until they enter 0.
        while (num != 0) {

            // Ask for the first number to be added
            numS = JOptionPane.showInputDialog("Enter a number to be summed." , "Enter 0 to exit");
            
            // Parses the number string into an integer
            num = Integer.parseInt(numS);

            if (num == 0) {
                break;
            }

            // Adds the number to the sum and prints the new sum.
            sum += num;
            System.out.println("Sum:" + sum);// Not needed each loop. Could do it once when at "La Fin".
        }

        // Just for fun. Means the end in french.
        System.out.println("La Fin.");
    }
}
