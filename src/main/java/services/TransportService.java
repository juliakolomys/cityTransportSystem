package services;

import entities.Transport;
import entities.Passenger;

public interface TransportService {
    boolean boardPassenger(Transport transport, Passenger passenger);
    boolean disembarkPassenger(Transport transport, Passenger passenger);
}
