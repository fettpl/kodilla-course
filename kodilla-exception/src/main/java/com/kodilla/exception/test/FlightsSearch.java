package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Flight wawToLax = new Flight("Warsaw", "Los Angeles");
        Flight laxToWaw = new Flight("Los Angeles", "Warsaw");
        Flight berToLax = new Flight("Berlin", "Los Angeles");
        Flight laxToBer = new Flight("Los Angeles", "Berlin");
        Flight krkToJFK = new Flight("Cracow", "New York");

        Map<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put(wawToLax.arrivalAirport, wawToLax.isFlightAllowed());
        flights.put(laxToWaw.arrivalAirport, laxToWaw.isFlightAllowed());
        flights.put(berToLax.arrivalAirport, berToLax.isFlightAllowed());
        flights.put(laxToBer.arrivalAirport, laxToBer.isFlightAllowed());
        flights.put(krkToJFK.arrivalAirport, krkToJFK.isFlightAllowed());

        return flights;
    }

    public static void main(String[] args) {
        if (flights.containsValue(true)) {
            System.out.println(flights);
        }
        throw new RouteNotFoundException("Flight not found!");
    }
}
