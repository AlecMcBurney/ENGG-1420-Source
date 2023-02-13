/*
 * Mackenzie Alec McBurney
 * 2023/02/10
 * Assignment 4 Part 7
 * 
 * Implement a main method in the Circle class and create an array of 100 circles with radiuses of 1 to 100.
 * Further, create a circle C with a random radius (between 10 and 1000), and add the first 100 circles to
 * circle C using the addAll method. Before and after this operation, print the value of the radius of the circle
 * C.
 */
package assignment4;

/**
 *
 * @author kyure
 */
public class CircleProgram {
    public static void main(String[] args){
        /*
        Main Circle object.
        Array of 100 Circle objects.
        */
        Circle C = new Circle(26);
        Circle[] circles;
        circles = new Circle[100];
        for(int i = 0; i < 100; i++){
            circles[i] = new Circle(i+1); // Declare values of radii 1-100.
        }
        System.out.println("Circle C has the radius of: " + C.getR()); // Print radius of C.
        System.out.println("C new radius: " + C.addAll(circles)); // New radius of C.
    }
}