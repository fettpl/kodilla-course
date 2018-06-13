package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.List;

public final class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigInteger getPeopleQuantity() {
        return continents.stream()
            .flatMap(continent -> continent.getCountries().stream())
            .map(Country::getCitizenQuantity)
            .reduce(BigInteger.ZERO, BigInteger::add);
    }
}
