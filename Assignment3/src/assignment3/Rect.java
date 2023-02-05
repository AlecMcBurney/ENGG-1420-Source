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

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author kyure
 */
public class Rect {

    // Initializing variables
    private int width, length; // Holds the length and width and side holds both to be passed to other methods.
    private int x, y; // Holds the x and y coordinates and chord holds both to be passed to other methods.
    private int perimeter; // Holds the perimeter value of the inputted rectangle.
    private long area; // Holds the area value of the inputted rectangle.

    /**
     * Primary constructor with set coordinates and modifiable sides.
     *
     * @param width
     * @param length
     */
    public Rect(int width, int length) {
        this.x = 0;
        this.y = 0;
        setWidth(width);
        setLength(length);
    }

    /**
     * Secondary constructor with modifiable sides and coordinates.
     *
     * @param x
     * @param y
     * @param width
     * @param length
     */
    public Rect(int x, int y, int width, int length) {
        this(width, length);

        setX(x);
        setY(y);
    }

    /**
     * A method which calculates and returns the perimeter of a rectangle.
     * 
     * @return perimeter
     */
    public int getPerimeter() {
        perimeter = 2 * this.width + 2 * this.length;
        return perimeter;
    }

    /**
     * A method which calculates and returns the area of a rectangle.
     * 
     * @return area
     */
    public long getArea() {
        area = this.width * this.length;
        return area;
    }

    /**
     * A method that receives two parameters x and y of type int and changes the
     * position of the rectangle.
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * A method which takes a parameter n of type int and set the length and
     * width of the rectangle to n.
     *
     * @param n
     */
    public void changeSize(int n) {
        this.length = n;
        this.width = n;
    }

    /**
     * A method that prints the information of the rectangle including its
     * coordinates, length, width, circumference/perimeter, and area.
     */
    public void print() {
        System.out.println("Here is information about your rectangle.\nCoordinates: (" + this.x + "," + this.y + ")\nChanged length: "
                + this.length + "\nChanged width: " + this.width + "\nPerimeter: " + this.perimeter + "\nArea: " + this.area);
    }

    /**
     * A method that takes an object of type Rect as a parameter and compares it
     * with the current rectangle. If the area of the current object is larger
     * than the area of the parameter object, return true and otherwise return
     * false.
     * 
     * @param otherArea
     * @return bigger
     */
    public boolean isBiggerThan(long otherArea) {
        boolean bigger = false;
        if (this.area > otherArea) {
            bigger = true;
        }
        return bigger;
    }

    /**
     * Mutator for the var width.
     * 
     * @param width
     */
    final public void setWidth(int width) {
        // Check for 0 value and change to 1.
        if (width == 0) {
            this.width = 1;
        } else {
            // Make sure final value is a positive int incase a negative int.
            this.width = Math.abs(width);
        }
    }

    /**
     * Mutator for the var length.
     * 
     * @param length
     */
    final public void setLength(int length) {
        // Check for 0 value and change to 1.
        if (length == 0) {
            this.length = 1;
        } else {
            //Make sure final value is a positive int incase a negative int.
            this.length = Math.abs(length);
        }
    }
    
    /**
     * Mutator for var x
     * 
     * @param x
     */
    final public void setX(int x){
        this.x = x;
    }
    
    /**
     * Mutator for var y
     * 
     * @param y
     */
    final public void setY(int y){
        this.y = y;
    }

    /**
     * Accessor for the var width
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Accessor for the var length
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }
    
    /**
     * Accessor for the var x
     * 
     * @return x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Accessor for the var y
     * 
     * @return y
     */
    public int getY() {
        return y;
    }

}
