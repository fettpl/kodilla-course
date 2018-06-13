package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class PeopleCounter {
    public static void main(String [] args) {
        List<Country> Europe = new ArrayList<>();
        Europe.add(new Country("Poland", "38000000"));
        Europe.add(new Country("Germany", "128000000"));

        List<Country> Asia = new ArrayList<>();
        Asia.add(new Country("China", "600000000"));
        Asia.add(new Country("Japan", "200000000"));

        @Override
        List<Continent> continents = new ArrayList<>();
        continents.add(Europe);
        continents.add(Asia);

        World world = new World();
        world.getPeopleQuantity();
    }
}
