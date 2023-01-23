/**
 * Mackenzie Alec McBurney
 * 2023/01/21
 * Assignment 3 part 2
 * Implement a Program class and create an objects of type Rect inside its main method and use its
 * various methods.
 */
package assignment3;

import java.awt.geom.Arc2D;

/**
 *
 * @author kyure
 */
public class Program {

    public static void main(String[] args) {
        
        //Initialize and declare the object re's attributes to preset values.
        Rect re = new Rect();
        re.length = 13;
        re.width = 4;
        re.x = 0;
        re.y = 0;
        re.side = new int[]{4, 13};
        
        // Get the perimeter of the inputted rectangle.
        re.perimeter = re.getPerimeter();
        
        // Get the area of the inputted rectangle.
        re.area = re.getArea();
        
        // Move the coordinate of the top left corner of the rectangle.
        re.chord = re.move(2,4);
        re.x = re.chord[0];
        re.y = re.chord[1];
        
        // Change the length and width of the rectangle to the value of n.
        re.side = re.changeSize(14);
        re.length = re.side[0];
        re.width = re.side[1];
        
        // Print of information about the rectangle.
        re.print();
    }

}
