package com.kodilla.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsApp {
    private FlightDb flightDb;

    public FlightsApp(FlightDb flightDb) {
        this.flightDb = flightDb;
    }

    public List<Flight> flightsFrom(String aiportForDeparture) {
        return flightDb.getFlights().stream()
                .filter(f -> f.getAirportForDeparture().equals(aiportForDeparture))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsTo(String airportForArrival) {
        return flightDb.getFlights().stream()
                .filter(f -> f.getAirportForArrival().equals(airportForArrival))
                .collect(Collectors.toList());
    }
}
