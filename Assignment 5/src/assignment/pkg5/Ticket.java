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

/**
 *
 * @author kyure
 */
public class Ticket {

    static private int count;
    static private int price;
    static private int capacity;

    private String marker;
    private String name;
    private String lastName;
    private String natCode;
    private String source;
    private String destination;
    private String depTime;

    public Ticket(String name, String lastName, String natCode, String source, String destination, String depTime, int price) {
        count++;
        setName(name);
        setLastName(lastName);
        setNatCode(natCode);
        setSource(source);
        setDestination(destination);
        setDepTime(depTime);
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNatCode() {
        return natCode;
    }

    public void setNatCode(String natCode) {
        this.natCode = natCode;
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

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println(count);
        for (int i = 0; i < count; i++){
            System.out.println("Ticket #: " + i);
            System.out.println("Passenger name: " + name + " " + lastName);
            System.out.println("National code: " + natCode);
            System.out.println("From: " + source);
            System.out.println("To: " + destination);
            System.out.println("Departure time: " + depTime);
            System.out.println("Marker: " + marker);
        }
    }

    public void add() {
        
    }

    public void marker() {

    }
    
    

}
