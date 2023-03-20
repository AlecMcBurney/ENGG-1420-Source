/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg5;

/**
 *
 * @author kyure
 */
public class PlaneTicket extends Ticket {

    public PlaneTicket(String source, String destination, String depTime) {
        super(source, destination, depTime, 150);
        super.setVehicle("Plane");
    }

}
