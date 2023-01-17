/**
 *
 *
 */
package assignment.pkg2;

import javax.swing.JOptionPane;

public class Assignment2Part4 {

    public static void main(String[] args) {
        int num, sum;
        String numS;
        num = 1;
        sum = 0;
        while (num != 0) {
            numS = JOptionPane.showInputDialog("Enter a number to be summed:");
            num = Integer.parseInt(numS);
            sum += num;
            System.out.println("sum:" + sum);
        }
        System.out.println("La Fin.");
    }
}
