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
 *          circumference, and area.
 */
package assignment3;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import javafx.geometry.Side;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author kyure
 */
public class Rect {
    
    // Initializing variables
    int width, length, side[]; // Holds the length and width and side holds both to be passed to other methods.
    int x, y, chord[]; // Holds the x and y coordinates and chord holds both to be passed to other methods.
    int perimeter; // Holds the perimeter value of the inputted rectangle.
    long area; // Holds the area value of the inputted rectangle.
    
    /**
     *A method that calculates the perimeter of a rectangle given the side lengths.
     */
    int getPerimeter() {
        int perimeter;
        perimeter = 2 * width + 2 * length;
        return perimeter;
    }
    
    /**
     * A method that calculates the area of a rectangle given the side lengths.
     */
    long getArea() {
        long area;
        area = width * length;
        return area;
    }
    
    /**
     * A method that changes the coordinate of the top left corner of a rectangle.
     */
    int[] move (int x, int y) {
        int chord[] = {x, y};
        return chord;
    }
    
    /**
     * A method that changes both the length and width of a rectangle to the value n.
     */
    int[] changeSize(int n) {
        int dimension[] = {n, n};
        return dimension;
    }
    
    /**
     * A method that prints out information about the rectangle.
     */
    void print() {
        System.out.println("Here is information about your rectangle.\nCoordinates: (" + x + "," + y + ")\nChanged length: " + length + "\nChanged width: " + width + "\nPerimeter: " + perimeter + "\nArea: " + area);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
