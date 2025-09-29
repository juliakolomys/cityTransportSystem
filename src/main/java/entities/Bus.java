package entities;

public class Bus extends Transport  {
    private static int busCounter = 1;
    private boolean isDoubleDecker;


        public Bus(int routeNumber, int capacity, boolean isDoubleDecker) {
            super("B" + busCounter++, routeNumber, capacity);
            this.isDoubleDecker = isDoubleDecker;
        }

        @Override
        public void move() {
            System.out.println("Bus " + getId() + " is driving on road route " + getRouteNumber());
        }


    @Override
    public void displayInfo () {
        System.out.println("Bus ID:" + getId() + ", Route:" + getRouteNumber() +
                ", Capacity:" + getCapacity() + ", DoubleDecker:" + isDoubleDecker);
    }
}