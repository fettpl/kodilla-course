package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("User1", "user1@kodilla.com");
        Product product = new Product("Product1", 20);
        LocalDateTime orderDate = LocalDateTime.of(2018, 8, 7, 12, 50);

        return new OrderRequest(user, product, orderDate);
    }
}
