package services;

import entities.Person;
import entities.Passenger;
import entities.Driver;

public interface PersonService {
    void addPassenger(Passenger p);
    void addDriver(Driver d);
    Passenger findPassengerById(String id);
    Driver findDriverById(String id);
    void removePassenger(String id);
    void removeDriver(String id);
}
