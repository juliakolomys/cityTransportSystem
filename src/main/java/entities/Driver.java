package entities;

public class Driver extends Person {
    public Driver(String id, String name) {
        super(id, name);
    }

    public void drive(Transport t) {
        System.out.println(getName() + " is driving transport with ID " + t.getId());
        t.move();
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver: " + getName() + ", ID:" + getId());
    }
}
