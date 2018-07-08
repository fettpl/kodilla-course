package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderProcessor {
    private ProductInformationService productInformationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(ProductInformationService productInformationService, ProductOrderService productOrderService,
                          ProductOrderRepository productOrderRepository) {
        this.productInformationService = productInformationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isSold = productOrderService.sell(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderDate());
        if (isSold) {
            productInformationService.inform(orderRequest.getUser());
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
