/**
 * Mackenzie Alec McBurney
 * 2023/01/16
 * Assignment 2 part 3a
 * Consider the following code snippet (code indentation has been intentionally removed):
 * if ( y == 8 )
 * if ( x == 5 )
 * System.out.println( "@@@@@" );
 * else
 * System.out.println( "#####" );
 * System.out.println( "$$$$$" );
 * System.out.println( "&&&&&" );
 * a. Modify the above code so that its output for x = 5 and y = 8 is as follows:
 * @@@@@ 
 * $$$$$ 
 * &&&&&
 */
package assignment.pkg2;

public class Assignment2Part3a {

    public static void main(String[] args) {

        // Initialization and declaration of variables x and y.
        int x, y;
        x = 5;
        y = 8;

        //Prints certain characters depending on the combined values of x and y.
        if (x == 5) {
            if (y == 8) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}
