package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, LocalDateTime orderDate) {
        System.out.println("Last order: " + product.getProductName() + " (quantity: " + product.getProductQuantity()
        + ") purchased by " + user.getName() + " on " + orderDate.toString());

        return true;
    }
}
