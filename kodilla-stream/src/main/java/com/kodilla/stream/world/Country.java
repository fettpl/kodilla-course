package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private String countryName;
    private BigInteger citizenQuantity;

    public Country(String countryName, BigInteger citizenQuantity) {
        this.countryName = countryName;
        this.citizenQuantity = citizenQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigInteger getCitizenQuantity() {
        return citizenQuantity;
    }
}
