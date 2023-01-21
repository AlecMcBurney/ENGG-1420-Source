/**
 * Mackenzie Alec McBurney
 * 2023/01/
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

    int width, length, x, y, chord[], side[], perimeter;
    long area;
    
    //A method that calculates the perimeter of a rectangle given the side lengths.
    int getPerimeter() {
        int perimeter, n;
        perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    long getArea() {
        long area;
        area = width * length;
        return area;
    }

    int[] move() {
        int chord[] = {2, 4};
        return chord;
    }

    int[] changeSize(int n) {
        int dimension[] = {n, n};
        return dimension;
    }

    void print() {
        System.out.println("Here is information about your rectangle.\nCoordinates: (" + x + "," + y + ")\nLength: " + length + "\nWidth: " + width + "\nPerimeter: " + perimeter + "\nArea: " + area);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
