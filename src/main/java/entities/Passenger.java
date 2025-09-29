package entities;

public class Passenger extends Person {
    private String ticketNumber;

    public Passenger(String id,String name, String ticketNumber) {
        super(id, name);
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger:" + getName() + ", ID:" + getId() + ", Ticket:" + ticketNumber);
    }
}