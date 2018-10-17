package com.kodilla.good.patterns.flights;

public class Flight {
    private final int flightNumber;
    private final String airportForDeparture;
    private final String airportForArrival;

    public Flight(int flightNumber, String airportForDeparture, String airportForArrival) {
        this.flightNumber = flightNumber;
        this.airportForDeparture = airportForDeparture;
        this.airportForArrival = airportForArrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAirportForDeparture() {
        return airportForDeparture;
    }

    public String getAirportForArrival() {
        return airportForArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (!airportForDeparture.equals(flight.airportForDeparture)) return false;
        return airportForArrival.equals(flight.airportForArrival);
    }

    @Override
    public int hashCode() {
        int result = flightNumber;
        result = 31 * result + airportForDeparture.hashCode();
        result = 31 * result + airportForArrival.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", airportForDeparture='" + airportForDeparture + '\'' +
                ", airportForArrival='" + airportForArrival + '\'' +
                '}';
    }
}
