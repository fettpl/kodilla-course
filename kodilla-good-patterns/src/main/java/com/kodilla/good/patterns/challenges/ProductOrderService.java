package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    public boolean sell(final User user, final Product product, final LocalDateTime orderDate) {
        System.out.println("Sold " + product.getProductName() + " to " + user.getName() + " (contact email: "
                + user.getEmail() + "). Quantity sold: " + product.getProductQuantity() + ".");

        return true;
    }
}
