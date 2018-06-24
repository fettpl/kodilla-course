package com.kodilla.exception.test;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public boolean isFlightAllowed() {
        if(arrivalAirport == "Los Angeles" || "Warsaw") {
            return true;
        } else {
            return false;
        }
    }
}
