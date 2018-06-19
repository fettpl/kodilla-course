package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class PeopleCounter {
    public static void main(String [] args) {
        List<Country> europeCoutries = new ArrayList<>();
        europeCoutries.add(new Country("Poland", new BigInteger("38000000")));
        europeCoutries.add(new Country("Germany", new BigInteger("128000000")));
        Continent europe = new Continent("Europe", europeCoutries);
        List<Country> asiaCoutries = new ArrayList<>();
        asiaCoutries.add(new Country("China", new BigInteger("600000000")));
        asiaCoutries.add(new Country("Japan", new BigInteger("200000000")));
        Continent asia = new Continent("Asia", asiaCoutries);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);

        World world = new World(continents);
        System.out.println(world.getPeopleQuantity());
    }
}
