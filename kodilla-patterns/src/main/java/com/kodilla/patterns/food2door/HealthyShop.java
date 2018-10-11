package com.kodilla.patterns.food2door;

public class HealthyShop implements ProductProcessor {

    @Override
    public boolean process() {
        System.out.println("Lorem ipsum dolor");
        return true;
    }
}
