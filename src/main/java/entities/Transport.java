package entities;



public abstract class Transport {
    private final String id;
    private final int routeNumber;
    private final int capacity;


    public Transport(String id, int routeNumber, int capacity) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public void move() {
        System.out.println("Transport " + id + " is moving on route " + routeNumber);
    }

    public abstract void displayInfo();

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

}
