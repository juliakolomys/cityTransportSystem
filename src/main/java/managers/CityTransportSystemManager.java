package managers;

import entities.Transport;
import entities.Passenger;
import entities.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class CityTransportSystemManager {
    private List<Transport> transports = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();


    private Map<Transport, List<Passenger>> transportPassengersMap = new HashMap<>();

    public void addTransport(Transport t) {
        transports.add(t);
        transportPassengersMap.put(t, new ArrayList<>());
    }

    public void addDriver(Driver d) {
        drivers.add(d);
    }

    public void addPassenger(Passenger p) {
        passengers.add(p);
    }

    public void removePassenger(Passenger p) {
        passengers.remove(p);
        for (List<Passenger> passengerList : transportPassengersMap.values()) {
            passengerList.remove(p);
        }
    }

    public void boardPassenger(Transport t, Passenger p) {
        List<Passenger> currentPassengers = transportPassengersMap.get(t);
        if (currentPassengers == null) {
            System.out.println("Transport not found");
            return;
        }
        if (currentPassengers.size() < t.getCapacity()) {
            currentPassengers.add(p);
            System.out.println("Passenger " + p.getName() + " boarded transport " + t.getId());
        } else {
            System.out.println("Transport " + t.getId() + " is full." + p.getName() + " сannot be boarded");
        }
    }

    public void disembarkPassenger(Transport t, Passenger p) {
        List<Passenger> currentPassengers = transportPassengersMap.get(t);
        if (currentPassengers != null & currentPassengers.remove(p)) {
            System.out.println("Passenger " + p.getName() + " disembarked from transport " + t.getId());
        } else {
            System.out.println("Passenger " + p.getName() + " not found in transport " + t.getId());
        }
    }

    public void displayAllInfo() {
        System.out.println("\n~~~ Transports ~~~");
        for (Transport t : transports) {
            t.displayInfo();
            List<Passenger> passengerList = transportPassengersMap.get(t);
            System.out.println("Passengers on transport " + t.getId() + ":");
            if (passengerList != null & !passengerList.isEmpty()) {
                for (Passenger p : passengerList) {
                    System.out.println("- " + p.getName());
                }
            } else {
                System.out.println("No passengers");
            }
        }

        System.out.println("\n~~~ Drivers ~~~");
        for (Driver d : drivers) {
            d.displayInfo();
        }

        System.out.println("\n~~~ Passengers ~~~");
        for (Passenger p : passengers) {
            p.displayInfo();
        }
    }
}
