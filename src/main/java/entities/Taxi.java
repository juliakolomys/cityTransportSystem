package entities;

public class Taxi extends Transport  {
    private static int taxiCounter = 1;
    private boolean isAvailable;

    public Taxi(int routeNumber, int capacity, boolean isAvailable) {
        super("TX" + taxiCounter++, routeNumber, capacity);
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("Taxi ID:" + getId() + ", Route:" + getRouteNumber() +
                ", Capacity:" + getCapacity() + ", Status: " + (isAvailable  ?  "Available" : "not available"));
    }


}
