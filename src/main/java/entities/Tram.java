package entities;

public class Tram extends Transport {
    private static int tramCounter = 1;
    private double trackDistance;

    public Tram(int routeNumber, int capacity, double trackDistance) {
        super("T" + tramCounter++, routeNumber, capacity); // T1, T2, ...
        this.trackDistance = trackDistance;
    }

    @Override
    public void move() {
        System.out.println("Tram " + getId() + " is moving on rails (" + trackDistance + "kilometers from here)");
    }

    @Override
    public void displayInfo() {
        System.out.println("Tram ID:" + getId() + ", Route:" + getRouteNumber() +
                ", Capacity:" + getCapacity() + ", Track distance:" + trackDistance);
    }

}
