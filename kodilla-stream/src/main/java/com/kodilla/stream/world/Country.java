package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    public BigDecimal getPeopleQuantity(String numberOfPeople) {
        BigDecimal peopleQuantity = new BigDecimal(numberOfPeople);
        return peopleQuantity;
    }
}
