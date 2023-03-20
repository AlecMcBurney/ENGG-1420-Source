/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author kyure
 */
public class Bus1Ticket extends Ticket {

    // Capacity[2]
    public Bus1Ticket(String source, String destination, String depTime) {
        super(source, destination, depTime, 60);
        super.setVehicle("Bus");
    }

}
