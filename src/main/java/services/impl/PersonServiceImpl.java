package services.impl;

import entities.Passenger;
import entities.Driver;
import services.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private final List<Passenger> passengers = new ArrayList<>();
    private final List<Driver> drivers = new ArrayList<>();

    @Override
    public void addPassenger(Passenger p) {
        passengers.add(p);
    }

    @Override
    public void addDriver(Driver d) {
        drivers.add(d);
    }

    @Override
    public Passenger findPassengerById(String id) {
        return passengers.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Driver findDriverById(String id) {
        return drivers.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void removePassenger(String id) {
        passengers.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public void removeDriver(String id) {
        drivers.removeIf(d -> d.getId().equals(id));

    }
}
