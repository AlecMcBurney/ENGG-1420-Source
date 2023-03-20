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
public class TicketTest {

    public static void main(String[] args) {
        String[] options = {"Bus", "VIP Bus", "Train", "Plane"};
        int vehicle = JOptionPane.showOptionDialog(null, "Chose a form of transportation",
                "Vehicles",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String source = JOptionPane.showInputDialog(null, "Enter departure location: ");
        String destination = JOptionPane.showInputDialog(null, "Enter destination: ");
        String depTime = JOptionPane.showInputDialog(null, "Enter departure time: ");
        switch (vehicle) {
            case 0:
                Bus1Ticket bus1 = new Bus1Ticket(source, destination, depTime);
                while (0 == JOptionPane.showInternalConfirmDialog(null, "Would you like to add a passenger?")) {
                    int tickets = getTickets(bus1);
                    bus1.add(getPassenger(), tickets, vehicle);
                }
                ;
                bus1.print();
                break;
            case 1:
                Bus2Ticket bus2 = new Bus2Ticket(source, destination, depTime);
                while (0 == JOptionPane.showInternalConfirmDialog(null, "Would you like to add a passenger?")) {
                    int tickets = getTickets(bus2);
                    bus2.add(getPassenger(), tickets, vehicle);
                }
                ;
                bus2.print();
                break;
            case 2:
                TrainTicket train = new TrainTicket(source, destination, depTime);
                while (0 == JOptionPane.showInternalConfirmDialog(null, "Would you like to add a passenger?")) {
                    int tickets = getTickets(train);
                    train.add(getPassenger(), tickets, vehicle);
                }
                ;
                train.print();
                break;
            case 3:
                PlaneTicket plane = new PlaneTicket(source, destination, depTime);
                while (0 == JOptionPane.showInternalConfirmDialog(null, "Would you like to add a passenger?")) {
                    int tickets = getTickets(plane);
                    plane.add(getPassenger(), tickets, vehicle);
                }
                ;
                plane.print();
                break;
        }
    }

    public static Person getPassenger() {
        String name = JOptionPane.showInputDialog(null, "Enter first name: ");
        String lastName = JOptionPane.showInputDialog(null, "Enter last name");
        String natCode = JOptionPane.showInputDialog(null, "Enter your SIN: ");
        Person newPassenger = new Person(name, lastName, natCode);
        return newPassenger;
    }

    public static int getTickets(Ticket t) {
        boolean correctInput = false;
        String ticketString = "Eror Congrats you fucked something up dumbnuts if you got here";
        while (correctInput == false) {
            ticketString = JOptionPane.showInputDialog(null, "Enter number of desired tickets: ");
            if (Integer.parseInt(ticketString) + t.getLocalCount() <= t.getCapacity()) {
                correctInput = true;
            } else {
                System.out.println("Not enough space in vehicle. Please try another vehicle or departure time.");
            }
        }
        return Integer.parseInt(ticketString);
    }
}
