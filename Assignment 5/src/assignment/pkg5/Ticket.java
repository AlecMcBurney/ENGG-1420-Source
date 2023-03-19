/*
 * Mackenzie McBurney
 * 2023/03/11
 * Assignment 5 Part 
1. Implement a ticketing system to register tickets for trains, planes and two types of buses as
follows:
    Implement a Ticket class.
    i. Each ticket object needs to include the following information regardless of the type
    of vehicle:
        • name
        • last name
        • National Code
        • Source
        • Destination
        • Departure time
        • Price
        • A special marker that is different for each ticket
    ii. The Ticket class needs to store the following information:
        • The capacity of each ticket
        • Count all the tickets made
        • Save all tickets made regardless of the type of vehicle
    iii. Implement the following methods for the Ticket class:
        • print method: This method is required to first print the number of all tickets have
        made so far in one line and then print all the tickets with their details in the next
        lines.
        • add method: This method takes a parameter of type Person that includes name,
        last name and national code of a person and add the person to the ticket list of
        that vehicle.
        • Overloaded version of add method: This method does the same thing as the
        previous method, but in addition to a person, it takes a number n. Using this
        method, it is possible to register n tickets for a person once.
        • marker method: This method is for registering a specific marker and works
        differently according to the class in which it is located and is required to create a
        specific phrase or marker whose algorithm is as follows:
        Ticket number + registration date + vehicle name
        For example, if a person buys a bus ticket on October 17, 2021, and that ticket is
        the 53rd ticket purchased on that day, the specific indicator or phrase will be as
        follows (design the marker method to record the current system time)
        Bus20210917
        • discount method: Define the method that if a person buys more than 5 tickets, a
        2% discount is included in his ticket and 1% is added for every 5 additional
        people, for example, if someone buys 14 tickets, he will be given a 3% discount.
        test
 */
package assignment.pkg5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author kyure
 */

public abstract class Ticket {

    static private int count;
    static private ArrayList<String> list = new ArrayList<>();
    final static private int price = 1; // Price per ticket
    final private int capacity[] = {60,25,400,150}; // Bus 1, Bus 2, train, plane, 
    
    
    final private ArrayList<String> marker = new ArrayList<>(); // Special marker for ticket
    final private ArrayList<String> name = new ArrayList<>(); // Name per ticket
    final private ArrayList<String> lastName = new ArrayList<>(); // Last name per ticket
    final private ArrayList<String> natCode = new ArrayList<>(); // National Code/SIN number
    
    private String source; // Departs from
    private String destination; // End of trip
    private String depTime; // Time of departure
    private String vehicle; // Type of vehice
    private int localCount; // Number of tickets local to vahicle type
    final private ArrayList<Float> indivPrice = new ArrayList<>(); // Price per passenger(Sum of tickets per one name)
    
    public Ticket(String source, String destination, String depTime){
        this.setSource(source);
        this.setDestination(destination);
        this.setDepTime(depTime);
    }
    
    public Ticket(String marker){
        this.setMarker(marker, 0);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int inc) {
        Ticket.count += inc;
    }
    
    public static int getPrice() {
        return price;
    }

    public int[] getCapacity() {
        return capacity;
    }

    public String getMarker(int ticket) {
        return marker.get(ticket);
    }

    public void setMarker(String marker, int ticket) {
        this.marker.add(marker);
    }

    public String getName(int ticket) {
        return name.get(ticket);
    }

    public void setName(String name, int ticket) {
        this.name.add(name);
    }

    public String getLastName(int ticket) {
        return lastName.get(ticket);
    }

    public void setLastName(String lastName, int ticket) {
        this.lastName.add(lastName);
    }

    public String getNatCode(int ticket) {
        return natCode.get(ticket);
    }

    public void setNatCode(String natCode, int ticket) {
        this.natCode.add(natCode);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        System.out.println("Total " + vehicle + " Tickets: " + localCount);
        System.out.println("----------------------------------------");
        for (int i = 0; i < localCount; i++){
            System.out.println("Ticket #: " + i);
            System.out.println("Passenger name: " + getName(i) + " " + getLastName(i));
            System.out.println("National code: " + getNatCode(i));
            System.out.println("From: " + source);
            System.out.println("To: " + destination);
            System.out.println("Departure time: " + depTime);
            System.out.println("Marker: " + getMarker(i));
            System.out.println("----------------------------------------");
        }
    }

    public void add(Person passenger, int tickets, int transport) {
        for(int i=0;i<tickets;i++){
            if(localCount >= capacity[transport]){
                System.out.println("Sorry! There are no remaining seats for this ride. Please cancel and try another departure time.");
                break;
            }
        setName(passenger.getFirstName(), localCount);
        setLastName(passenger.getLastName(), localCount);
        setNatCode(passenger.getNatCode(), localCount);
        localCount++;
        marker();
        list.add(this.getMarker(i));
        }
        indivPrice.add(discount(tickets));
        
    }
    
    private void marker() {
        String markerString = new String();
        markerString = markerString.concat(Integer.toString(localCount));
        markerString = markerString.concat(getDate());
        markerString = markerString.concat(vehicle);
        setMarker(markerString, localCount);
    }
    
    private String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");  
        LocalDate now = LocalDate.now();
        String date = now.format(dtf);
        return date;
    }
    
    private float discount(int tickets){
        int reduce;
        float total;
        if(tickets/5 > 0){
            reduce = (tickets/5) +1 ;
            if(reduce > 100){
                reduce = 100;
            }
            float disPrice = getPrice()*(100-reduce)/100;
            total = disPrice * tickets;
            
            return total;
        }
        else{
            total = getPrice()*tickets;
            
            return total;
        }
    }
}
