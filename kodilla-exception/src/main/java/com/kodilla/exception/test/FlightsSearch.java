package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsSearch {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put("Warsaw", true);
        flights.put("Los Angeles", false);
        flights.put("Berlin", true);
        flights.put("Cracow", true);
        flights.put("Moscow", false);

        if(!flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        } else {
            return flights;
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
