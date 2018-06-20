package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetCountries() {
        //Given
        List<Country> americaCoutries = new ArrayList<>();
        americaCoutries.add(new Country("United States", new BigInteger("321234000")));
        americaCoutries.add(new Country("Brazil", new BigInteger("204519000")));
        americaCoutries.add(new Country("Mexico", new BigInteger("121006000")));
        americaCoutries.add(new Country("Colombia", new BigInteger("48218000")));
        americaCoutries.add(new Country("Argentina", new BigInteger("43132000")));

        //When
        Continent america = new Continent("America", americaCoutries);
        america.getCountries().size();

        //Then
        Assert.assertEquals(5, america.getCountries().size());
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> africaCoutries = new ArrayList<>();
        africaCoutries.add(new Country("Egypt", new BigInteger("122000000")));
        africaCoutries.add(new Country("Algeria", new BigInteger("563000000")));
        africaCoutries.add(new Country("Ghana", new BigInteger("22300000")));
        africaCoutries.add(new Country("Rwanda", new BigInteger("19000000")));
        africaCoutries.add(new Country("Nigeria", new BigInteger("94000000")));
        Continent africa = new Continent("Africa", africaCoutries);

        //When
        List<Continent> continents = new ArrayList<>();
        continents.add(africa);
        World earth = new World(continents);
        earth.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigInteger("820300000"), earth.getPeopleQuantity());
    }
}
