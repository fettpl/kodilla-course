package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put("Warsaw", true);
        flights.put("Los Angeles", false);
        flights.put("Berlin", true);
        flights.put("Cracow", true);
        flights.put("Moscow", false);

        if(flights.get(flight.getDepartureAirport())) {
            System.out.println("You can travel from " + flight.getDepartureAirport());
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {
        Flight warsawToLA = new Flight("Warsaw", "Los Angeles");
        Flight laToWarsaw = new Flight("Los Angeles", "Warsaw");
        FlightsSearch flightsSearch = new FlightsSearch();
        flightsSearch.findFlight(warsawToLA);
        flightsSearch.findFlight(laToWarsaw);

    }
}
