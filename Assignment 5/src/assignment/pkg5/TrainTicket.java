/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg5;

/**
 *
 * @author kyure
 */
public class TrainTicket extends Ticket{

    public TrainTicket(String source, String destination, String depTime) {
        super(source, destination, depTime,400);
        super.setVehicle("Train");
    }

}
