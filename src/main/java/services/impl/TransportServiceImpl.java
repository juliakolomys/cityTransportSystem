package services.impl;

import entities.Transport;
import entities.Taxi;
import entities.Passenger;
import services.TransportService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportServiceImpl implements TransportService {
    private final Map<Transport, List<Passenger>> transportPassengerMap = new HashMap<>();

    @Override
    public boolean boardPassenger(Transport transport, Passenger passenger) {
        List<Passenger> current = transportPassengerMap.get(transport);
        if (current == null) return false;

        if (transport instanceof Taxi) {
            Taxi taxi = (Taxi) transport;
            if (!taxi.isAvailable()) {
                System.out.println("Taxi " + taxi.getId() + " is not available");
                return false;
            }
        }

        if (current.size() < transport.getCapacity()) {
            current.add(passenger);

            if (transport instanceof Taxi) {
                ((Taxi) transport).setAvailable(false);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean disembarkPassenger(Transport transport, Passenger passenger) {
        List<Passenger> current = transportPassengerMap.get(transport);
        if (current == null) return false;

        boolean removed = current.remove(passenger);
        if (removed & transport instanceof Taxi) {
            if (current.isEmpty()) {
                ((Taxi) transport).setAvailable(true);
            }
        }
        return removed;
    }

    public void registerTransport(Transport transport, List<Passenger> passengerList) {
        transportPassengerMap.put(transport, passengerList);
    }

    public List<Passenger> getPassengers(Transport transport) {
        return transportPassengerMap.get(transport);
    }
}
