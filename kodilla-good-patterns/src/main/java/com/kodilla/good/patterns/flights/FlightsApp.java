package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsApp {
    private FlightDb flightDb;

    public FlightsApp(FlightDb flightDb) {
        this.flightDb = flightDb;
    }

    public List<Flight> flightsFrom(String airportForDeparture) {
        return flightDb.getFlights().stream()
                .filter(f -> f.getAirportForDeparture().equals(airportForDeparture))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsTo(String airportForArrival) {
        return flightDb.getFlights().stream()
                .filter(f -> f.getAirportForArrival().equals(airportForArrival))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsThrough(String airportToFlyThrough) {
        List<String> listFlightsEndingIn = flightDb.getFlights().stream()
                .filter(f -> f.getAirportForArrival().equals(airportToFlyThrough))
                .map(f -> f.getAirportForDeparture())
                .collect(Collectors.toList());

        List<String> listFlightsStartingIn = flightDb.getFlights().stream()
                .filter(f -> f.getAirportForDeparture().equals(airportToFlyThrough))
                .map(f -> f.getAirportForArrival())
                .collect(Collectors.toList());

        List<Flight> flightsThroughAirportIn = new ArrayList<>();

        for(String airportForDeparture : listFlightsEndingIn) {
            for(String airportForArrival : listFlightsStartingIn) {
                flightsThroughAirportIn.add(new Flight(0, airportForDeparture, airportForArrival));
            }
        }
        return flightsThroughAirportIn;
    }
}
