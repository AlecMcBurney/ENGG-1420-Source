/*
 * Mackenzie Alec McBurney
 * 2023/02/07
 * 
 * Implement a RandomString class that has a method called nextString that takes a parameter n of type int
 * and returns a random string of length n characters. The random string can only contain lowercase and
 * uppercase letters of the English alphabet, digits 0 to 9, and cannot start with a digit. To implement this
 * class, you can use java.util.Random class.
 */
package assignment4;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * A class that is similar to an addition to the java.util.Random package.
 * Contains a method that returns a random string.
 * @author kyure
 */
public class RandomString {
    
    /**
     * A method that returns a random string of length n.
     * Cannot start with a number.
     * 
     * @param n
     * @return randStr
     */
    public String nextString(int n) {
        String randStr = new String();
        Random number = new Random();
        int num;
        char nextChar;
        boolean charType;

        for (int i = 1; i <= n; i++) {
            charType = charType(i);
            if (charType == false) {
                num = letterAscii((int) number.nextInt(26), lowerOrUpperCase());
            } else {
                num = numberAscii((int) number.nextInt(10));
            }
            nextChar = (char) num;
            String str = String.valueOf(nextChar);
            randStr = randStr.concat(str);
        }
        return randStr;
    }
    
    /**
     * A method that randomly decides if a letter is upper case or lower case.
     * 
     * @return capital
     */
    private boolean lowerOrUpperCase() {
        Random bool = new Random();
        boolean capital;
        capital = bool.nextBoolean();
        return capital;
    }
    
    /**
     * A method that randomly determine if an ASCII value will be of a letter 
     * or number
     * 
     * @param index
     * @return type
     * @return false
     */
    private boolean charType(int index) {
        Random bool = new Random();
        boolean type;
        if (index == 1) {
            return false; // Doesn't allow int for first char.
        } else {
            type = bool.nextBoolean();
            return type;
        }
    }
    
    /**
     * A method that randomly calculates an ASCII value for upper and lower case
     * letters.
     * 
     * @param num
     * @param bool
     * @return num
     */
    private int letterAscii(int num, boolean bool) {
        if (bool == true) {
            num += 65;
        } else {
            num += 97;
        }
        return num;
    }
    
    /**
     * A method that calculates an ASCII value for numbers 0-9.
     * 
     * @param num
     * @return num
     */
    private int numberAscii(int num) {
        num += 48;
        return num;
    }
    
    /**
     * Main method of the RandomString class that receives the output of the 
     * nextString method.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        RandomString test = new RandomString();
        String n = JOptionPane.showInputDialog("Enter string length: ");
        int num = Integer.parseInt(n);
        System.out.println(test.nextString(num));

    }

}