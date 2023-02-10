/*
 * Mackenzie Alec McBurney
 * 2023/02/09
 * Assignment 4 Part 6
 * 
 * 6- Define a method named add in the Circle class that takes a parameter of type Circle and adds its radius to
 * the radius of the current object (the object on which the method is called). Then,
 * a. Define a method called addAll in this class that takes an array of elements of type Circle as a
 * parameter and adds the radius of all these circles to the radius of the current object.
 */
package assignment4;

/**
 *
 * @author kyure
 */
public class Circle {
    // Circles have a radius.
    private int r;
    
    /**
     * Constructor for the Circle class.
     * @param r 
     */
    public Circle(int r) {
        this.r = r;
    }
    
    /**
     * Getter for var r.
     * @return r
     */
    public int getR(
    ) {
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
}
