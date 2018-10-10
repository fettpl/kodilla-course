package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("salad")
                .bun("Rice bun")
                .burgers(3)
                .ingredient("blue cheese")
                .ingredient("tomato")
                .build();

        System.out.println(bigmac);

        // When
        int howManyIngredients = bigmac.getIngredients().size();

        // Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
