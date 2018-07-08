package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean sell(User user, Product product, LocalDateTime orderDate);
}
