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
        Rect re = new Rect(); 
        re.length = 13;
        re.width = 4;
        re.x = 0;
        re.y = 0;
        
        re.perimeter = re.getPerimeter();
        
        re.area = re.getArea();
        
        re.chord = re.move();
        re.x = re.chord[0];
        re.y = re.chord[1];
        
        re.side = re.changeSize(14);
        
        re.length = re.side[0];
        re.width = re.side[1];
        
        re.print();
    }
    
}