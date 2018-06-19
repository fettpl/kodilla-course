package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private String contintenName;
    private List<Country> countries;

    public Continent(String contintenName, List<Country> countries) {
        this.contintenName = contintenName;
        this.countries = countries;
    }

    public String getContintenName() {
        return contintenName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
