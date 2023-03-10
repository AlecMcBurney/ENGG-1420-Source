/**
 * Mackenzie Alec McBurney
 * 2023/01/16
 * Assignment 2 part 3c
 * Consider the following code snippet (code indentation has been intentionally removed):
 * if ( y == 8 )
 * if ( x == 5 )
 * System.out.println( "@@@@@" );
 * else
 * System.out.println( "#####" );
 * System.out.println( "$$$$$" );
 * System.out.println( "&&&&&" );
 * Modify the above code so that its output for x = 5 and y = 7 is as follows:
 * #####
 * $$$$$
 * &&&&&
 */
package assignment.pkg2;

public class Assignment2Part3c {

    public static void main(String[] args) {

        // Initialization and declaration of variables x and y.
        int x, y;
        x = 5;
        y = 7;

        // Prints certain characters depending on the values of x and y.
        if (x == 5) {
            if (y == 8) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }
}
