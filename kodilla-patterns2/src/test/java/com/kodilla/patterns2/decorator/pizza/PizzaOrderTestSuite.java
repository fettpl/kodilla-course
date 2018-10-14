package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderWithTraditionalBase() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TraditionalBaseOrderDecorator(pizzaOrder);
        pizzaOrder = new MargheritaFillingOrderDecorator(pizzaOrder);
        pizzaOrder = new TomatoToppingOrderDecorator(pizzaOrder);

        // When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals(new BigDecimal(24), theCost);
        assertEquals("Ordered a pizza with traditional base, Margherita filling and tomato topping", description);
        System.out.println(theCost);
        System.out.println(description);
    }

    @Test
    public void testPizzaOrderWithThinBase() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThinBaseOrderDecorator(pizzaOrder);
        pizzaOrder = new HawaiianFillingOrderDecorator(pizzaOrder);
        pizzaOrder = new BbqToppingOrderDecorator(pizzaOrder);

        // When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals(new BigDecimal(24), theCost);
        assertEquals("Ordered a pizza with thin base, Hawaiian filling and BBQ topping", description);
        System.out.println(theCost);
        System.out.println(description);
    }

    @Test
    public void testPizzaOrderWithThickBase() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickBaseOrderDecorator(pizzaOrder);
        pizzaOrder = new MargheritaFillingOrderDecorator(pizzaOrder);
        pizzaOrder = new BbqToppingOrderDecorator(pizzaOrder);

        // When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals(new BigDecimal(28), theCost);
        assertEquals("Ordered a pizza with extra thick crust, Margherita filling and BBQ topping", description);
        System.out.println(theCost);
        System.out.println(description);
    }
}
