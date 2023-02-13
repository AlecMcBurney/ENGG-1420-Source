/*
 * Mackenzie Alec McBurney
 * 2023/02/05
 * Assignment 4 Part 1
 *
 * Implement a program that takes a string from input and returns it in summary
 * form. That is, if it has several identical consecutive characters, write one
 * character and then write the number of repetitions of that character. If the
 * number of repetitions is 1, there is no need to mention the number 1. Note
 * that, the letter’s case matter.
 */
package assignment4;

import javax.swing.JOptionPane;

/**
 *
 * @author kyure
 */

public class StringSummary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        str- the main user defined string.
        len- length of string
        character, nextChar- used to compare strings.
         */
        String str = getString();
        int len = str.length();
        char character = str.charAt(0);
        char nextChar;
        int count = 0;

        // loop through each index of the string
        for (int i = 0; i < len; i++) {
            nextChar = str.charAt(i);

            // Prints off the char and the number of times it appears.
            if (character != nextChar) {
                // Doesn't print off one time occurances.
                if (count == 1) {
                    System.out.print(character);
                } else {
                    System.out.print(character + "" + count);
                }
                count = 1;
            }

            // Increases number of occurances of a number.
            if (nextChar == character) {
                count++;
            }
            // Stores current char to compare during next loop.
            character = nextChar;
        }
        // Print off final character and occurances.
        if (count == 1) {
            System.out.print(character);
        } else {
            System.out.println(character + "" + count);
        }

    }

    /**
     * A method that gets a string from the user.
     *
     * @return str
     */
    public static String getString() {
        String str = JOptionPane.showInputDialog(null, "Enter a string: ");
        return str;
    }

}
