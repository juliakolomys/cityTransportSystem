package org.example;

import entities.*;
import managers.CityTransportSystemManager;
import services.PersonService;
import services.impl.PersonServiceImpl;

public class Dispatcher {
    public static void main(String[] args) {

        CityTransportSystemManager manager = new CityTransportSystemManager();
        PersonService personService = new PersonServiceImpl();

        Bus bus1 = new Bus(198, 20, true);
        Tram tram1 = new Tram(5, 20, 5.5);
        Taxi taxi1 = new Taxi(66, 2, true);


        manager.addTransport(bus1);
        manager.addTransport(tram1);
        manager.addTransport(taxi1);

        Driver driver1 = new Driver("01", "Mark");
        Driver driver2 = new Driver("02", "Nick");
        Driver driver3 = new Driver("03", "Kate");


        manager.addDriver(driver1);
        manager.addDriver(driver2);
        manager.addDriver(driver3);

        Passenger p1 = new Passenger("01", "Ann", "123");
        Passenger p2 = new Passenger("02", "Nick", "124");
        Passenger p3 = new Passenger("03", "Olive", "125");
        Passenger p4 = new Passenger("04", "Adam", "126");
        Passenger p5 = new Passenger("P5", "Julia", "127");

        manager.addPassenger(p1);
        manager.addPassenger(p2);
        manager.addPassenger(p3);
        manager.addPassenger(p4);
        manager.addPassenger(p5);

        manager.boardPassenger(bus1, p1);
        manager.boardPassenger(bus1, p2);
        manager.boardPassenger(tram1, p3);
        manager.boardPassenger(taxi1, p4);

        manager.boardPassenger(taxi1, p5);

        driver1.drive(bus1);
        driver2.drive(tram1);
        driver3.drive(taxi1);

        manager.disembarkPassenger(taxi1, p4);

        manager.boardPassenger(taxi1, p5);

        personService.findDriverById("01");
        personService.findPassengerById("03");

        manager.displayAllInfo();



    }
}
