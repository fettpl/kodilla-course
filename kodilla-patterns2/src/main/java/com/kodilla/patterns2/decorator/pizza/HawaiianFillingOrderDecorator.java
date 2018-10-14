package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianFillingOrderDecorator extends AbstractPizzaOrderDecorator {
    public HawaiianFillingOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Hawaiian filling";
    }
}
