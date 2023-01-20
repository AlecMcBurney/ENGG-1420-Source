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
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author kyure
 */
public class Rect {

    int width, length;
    int x, y;

    int getPerimeter() {
        int perimeter, n;
        perimeter = 2 * width + 2 * length;
        return perimeter;
    }

    long getArea() {
        double area;
        area = width * length;
        return area;
    }

    int move() {
        int x, y;
        x = 2;
        y = 4;
    }
    
     int changeSize (int n) {
        width = n;
        length = n;
    }
     
    void print() {
        System.out.println("Here is information about your rectangle.\nCoordinates: " + "\nlength: " + "\nwidth: " + "\ncircumference: " + "\narea: ");
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Width, Length, x, y;

    }

}
