/*
 * Mackenzie Alec McBurney
 * 2023/02/09
 * Assignment 4 Part 6 and 8
 * 
 * 6- Define a method named add in the Circle class that takes a parameter of type Circle and adds its radius to
 * the radius of the current object (the object on which the method is called). Then,
 * a. Define a method called addAll in this class that takes an array of elements of type Circle as a
 * parameter and adds the radius of all these circles to the radius of the current object.
 * 
 * 8- In the Circle class, implement a method called decompose, which can be used to decompose a circle into
 * its constituent circles. For example, if we have a circle object with radius 12, by calling the decompose
 * method on it, an array must be returned that contains 2 circles with radius 2 and one circle with radius 3.
 * Or if we call this method on a circle object with a radius of 120, we should return an array containing 5
 * circle objects. The first 3 elements of this array are circles with radius 2, the fourth element is a circle with
 * radius 3 and the fifth element is a circle with radius 5.
 */
package assignment4;

import java.util.*;

/**
 *
 * @author kyure
 */
public class Circle {

    // Circles have a radius.
    private int r;

    /**
     * Constructor for the Circle class.
     *
     * @param r
     */
    public Circle(int r) {
        this.r = r;
    }

    /**
     * Getter for var r.
     *
     * @return r
     */
    public int getR() {
        return r;
    }

    /**
     * Setter for var r.
     *
     * @param r
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * A method that adds the radius of a given circle to the current object.
     *
     * @param circle2
     */
    public void add(Circle circle2) {
        this.r += circle2.r;
    }

    /**
     * A method that adds the radii of an array to the current object.
     *
     * @param circles
     * @return this.r
     */
    public int addAll(Circle[] circles) {
        int i = 0;
        for (Circle circle : circles) {
            this.r += circle.r;
        }
        return this.r;
    }

    public Circle[] decompose() {
        ArrayList<Integer> factors = new ArrayList<>();
        // Circle[] decomposed;
        int r = this.r;
        while (r > 1) {
            // System.out.println("huh.");
            int i = 2;
            while (i > 0) {
                if (r % i == 0) {
                    r = r / i;
                    break;
                }
                i++;
            }
            factors.add(i);
        }
        Circle decomposed[] = new Circle[factors.size()];
        for (int i = 0; i < decomposed.length; i++) {
            decomposed[i] = new Circle(factors.get(i));
        }

        return decomposed;
    }
}
