package com.kodilla.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsList implements FlightDb {
    @Override
    public List<Flight> getFlights() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight(14739, "Warsaw", "LA"));
        flightsList.add(new Flight(22033, "LA", "Warsaw"));
        flightsList.add(new Flight(44467, "Paris", "Moscow"));
        flightsList.add(new Flight(50902, "Moscow", "LA"));
        flightsList.add(new Flight(14002, "Warsaw", "Moscow"));
        flightsList.add(new Flight(17099, "Paris", "LA"));

        return flightsList;
    }
}
