/*
 * Mackenzie Alec McBurney
 * 2023/02/08
 * Assignment 4 part 5
 * 
 * Implement a program that reads a string from the input and assumes that the input string contains several
 * email addresses separated by semicolons, commas, or space. Then, by using regular expressions
 * a. Print the number of email addresses that have the _ character.
 * b. Print the number of email addresses associated with Gmail.
 */
package assignment4;

import javax.swing.JOptionPane;

/**
 *
 * @author kyure
 */
public class Emails {

    public static void main(String[] args) {
        String emails;
        emails = JOptionPane.showInputDialog("Enter emails: ");
        System.out.println(char_Search(emails));
        System.out.println(gmails(emails));
    }

    public static int char_Search(String emails) {
        /*
        Variable initialization.
         */
        int num = 0;
        int emailsLen = emails.length();
        boolean found = false;
        for (int i = 0; i < emailsLen; i++) {
            if (emails.charAt(i) == '_') {
                if (!found) {
                    num++;
                    found = true;
                }
            }
            if (emails.charAt(i) == ';' || emails.charAt(i) == ' ' || emails.charAt(i) == ';') {
                found = false;
            }
        }
        return num;
    }

    public static int gmails(String emails) {
        int num = 0;
        String check = "gmail";
        int emailsLen = emails.length();
        int similarity;
        for (int i = 0; i < emailsLen; i++) {
            int j = 0;
            if (emails.charAt(i) == check.charAt(j)) {
                similarity = 0;
                while (j < 5 && i < emailsLen && emails.charAt(i) == check.charAt(j)) {
                    similarity++;
                    i++;
                    j++;
                }
                if (similarity == 5) {
                    num++;
                }
            }
        }
        return num;
    }
}
