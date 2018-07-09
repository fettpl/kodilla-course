package com.kodilla.good.patterns.challenges;

public class ProductInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("Product purchased by " + user.getName() + ". Confirmation sent to " + user.getEmail()
                + ".");
    }
}
