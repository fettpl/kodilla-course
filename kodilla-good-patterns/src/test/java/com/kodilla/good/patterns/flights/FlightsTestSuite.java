package com.kodilla.good.patterns.flights;

import org.junit.Assert;
import org.junit.Test;

public class FlightsTestSuite {

    @Test
    public void testFlightsFrom() {
        // Given
        FlightsList flightsList = new FlightsList();
        FlightsApp flightsApp = new FlightsApp(flightsList);

        // When
        int numberOfFlightsFromWarsaw = flightsApp.flightsFrom("Warsaw").size();
        int numberOfFlightsFromLa = flightsApp.flightsFrom("LA").size();

        // Then
        Assert.assertEquals(2, numberOfFlightsFromWarsaw);
        Assert.assertEquals(1, numberOfFlightsFromLa);
    }

    @Test
    public void testFlightsTo() {
        // Given
        FlightsList flightsList = new FlightsList();
        FlightsApp flightsApp = new FlightsApp(flightsList);

        // When
        int numberOfFlightsToMoscow = flightsApp.flightsTo("Moscow").size();
        int numberOfFlightsToWarsaw = flightsApp.flightsTo("Warsaw").size();

        // Then
        Assert.assertEquals(2, numberOfFlightsToMoscow);
        Assert.assertEquals(1, numberOfFlightsToWarsaw);
    }

    @Test
    public void TestFlightsThrough() {
        // Given
        FlightsList flightsList = new FlightsList();
        FlightsApp flightsApp = new FlightsApp(flightsList);

        // When
        int numberOfFlightsThroughLa = flightsApp.flightsThrough("LA").size();

        // Then
        Assert.assertEquals(2, numberOfFlightsThroughLa);
    }
}
