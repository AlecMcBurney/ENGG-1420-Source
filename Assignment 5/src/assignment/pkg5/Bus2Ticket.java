/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg5;

/**
 *
 * @author kyure
 */
public class Bus2Ticket extends Ticket {

    public Bus2Ticket(String source, String destination, String depTime) {
        super(source, destination, depTime, 25);
        super.setVehicle("VIPBus");
    }

}
