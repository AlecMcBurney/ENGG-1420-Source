/**
 * Mackenzie Alec McBurney
 * 2023/01/21
 * Assignment 3 part 2
 * Implement a Program class and create an objects of type Rect inside its main method and use its
 * various methods.
 */
package assignment3;

import java.awt.geom.Arc2D;
import javax.swing.JOptionPane;

/**
 *
 * @author kyure
 */
public class Program {

    public static void main(String[] args) {
        
        //Initialize and declare the object re's attributes to preset values.
        Rect re = new Rect(0,1,4,6);
        
        // Calculate the perimeter of the inputted rectangle.
        System.out.println("Perimeter: " + re.getPerimeter());

        // Get the area of the inputted rectangle.
        System.out.println("Area: " + re.getArea());
        
        // Move the coordinate of the top left corner of the rectangle.
        re.move(2, 4);
        
        // Change the length and width of the rectangle to the value of n.
        re.changeSize(14);
        System.out.println("Length and width: " + re.getLength() + ", " + re.getWidth());
        
        // Print of information about the rectangle.
        re.print();
    }

}
