/**
 * Mackenzie Alec McBurney
 * 2023/01/21
 * Assignment 3 Part 1
 * Implement a Rect class for the concept of rectangle. Each rectangle has the following properties:
 *      ● Coordinates of the left and top corner of the rectangle (including X and Y)
 *      ● the length
 *      ● the width
 * Each rectangle must also have the following methods:
 *      a. getPerimeter, which calculates and returns the perimeter of a rectangle.
 *      b. getArea, which calculates and returns the area of a rectangle.
 *      c. move, that receives two parameters x and y of type int and changes the position of the
 *          rectangle (i.e., the coordinates of the left and top corner of the rectangle) to (x, y).
 *      d. changeSize, which takes a parameter n of type int and set the length and width of the
 *          rectangle to n.
 *      e. print, that prints the information of the rectangle including its coordinates, length, width,
 *          circumference/perimeter, and area.
 * 
 * Assignment 3 part 5
 * 5. Consider the Rect class you defined in the Assignment#3, then modify its implementation based on the
 * following conditions:
 *      a. Add appropriate access modifiers to the class members
 *      b. There are only two ways to create an object of type Rect:
 *          • By giving the length and width of the rectangle
 *          • By giving the length, width and coordinates of the rectangle
 *      c. Add the required controls so that the length and width of the rectangle are always integers
 *          greater than 0. If the value of length or width is given a negative number, the absolute value
 *          of that number is considered, and if the value of length or width is given 0, it is considered
 *          1 instead of 0.
 *      d. Define isBiggerThan method in this class that takes an object of type Rect as a parameter
 *          and compares it with the current rectangle (i.e., the object on which the isBiggerThan
 *          method is called), and if the area of the current object is larger than the area of the
 *          parameter object, return true and otherwise return false.
 */
package assignment3;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import javafx.geometry.Side;
import javax.swing.JOptionPane;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author kyure
 */
public class Rect {

    // Initializing variables
    private int width, length, side[]; // Holds the length and width and side holds both to be passed to other methods.
    private int x, y, chord[]; // Holds the x and y coordinates and chord holds both to be passed to other methods.
    private int perimeter; // Holds the perimeter value of the inputted rectangle.
    private long area; // Holds the area value of the inputted rectangle.

    public Rect(int width, int length) {
        this.x = 0;
        this.y = 0;
        setWidth(width);
        setLength(length);
    }

    public Rect(int x, int y, int width, int length) {
        setX(x);
        setY(y);
        setWidth(width);
        setLength(length);
    }

    /**
     * A method that calculates the perimeter of a rectangle given the side
     * lengths.
     */
    public int getPerimeter() {
        this.perimeter = 2 * this.width + 2 * this.length;
        return this.perimeter;
    }

    /**
     * A method that calculates the area of a rectangle given the side lengths.
     */
    public long getArea() {
        this.area = this.width * this.length;
        return this.area;
    }

    /**
     * A method that changes the coordinate of the top left corner of a
     * rectangle.
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * A method that changes both the length and width of a rectangle to the
     * value n.
     */
    public void changeSize(int n) {
        this.length = n;
        this.width = n;
    }

    /**
     * A method that prints out information about the rectangle.
     */
    public void print() {
        System.out.println("\nHere is information about your rectangle.\nCoordinates: (" + this.x + "," + this.y + ")\nChanged length: "
                + this.length + "\nChanged width: " + this.width + "\nPerimeter: " + this.perimeter + "\nArea: " + this.area);
    }
    
    public boolean isBiggerThan(long otherArea){
        boolean bigger = false;
        if(this.area > otherArea){
            bigger = true;
        }
        return bigger;
    }
    /**
     * Mutator for the var width.
     */
    public void setWidth(int width) {
        /* boolean success = false;
        while (!success) {
            try {
                // Prompt user for a width value.
                width = JOptionPane.showConfirmDialog(null, "Enter width:");
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid input.");
            }
        } */
        // Check for 0 value and change to 1.
        if (width == 0) {
            width = 1;
        } else {
            // Make sure final value is a positive int incase a negative int.
            this.width = Math.abs(width);
        }
    }

    /**
     * Mutator for the var length.
     */
    public void setLength(int length) {
        /* boolean success = false;
        while (!success) {
            try {
                // Prompt user for a length value.
                length = JOptionPane.showConfirmDialog(null, "Enter length:");
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        } */
        // Check for 0 value and change to 1.
        if (length == 0) {
            length = 1;
        } else {
            //Make sure final value is a positive int incase a negative int.
            this.length = Math.abs(length);
        }
    }

    /**
     * Mutator for var x.
     */
    public void setX(int x) {
        /* boolean success = false;
        while (!success) {
            try {
                x = JOptionPane.showConfirmDialog(null, "X coordinate");
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        } */
    }

    /**
     * Mutator for the var y.
     */
    public void setY(int y) {
        /* boolean success = false;
        while (!success) {
            try {
                y = JOptionPane.showConfirmDialog(null, "Y coordinate");
            } catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        } */
    }

    /**
     * Accessor for the var width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Accessor for the var length
     */
    public int getLength() {
        return this.length;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
