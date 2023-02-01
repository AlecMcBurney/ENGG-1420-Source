/**
 * Mackenzie Alec McBurney
 * 2023/02/01
 * Assignment 3 part 4
 * Implement a program to create an object of type Date and use its various methods.
 */
package assignment3;

/**
 *
 * @author kyure
 */
public class DateProgram {
    public static void main(String[] args) {
        Date first = new Date(2019, 8, 23);
        Date second = new Date(2020, 4, 3);
        first.print();
        first.addDays(9562);
        first.print();
        System.out.println("Two dates are " + first.compare(second) + " days apart.");
    }
    
}
