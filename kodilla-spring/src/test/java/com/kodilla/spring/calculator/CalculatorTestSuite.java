package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test public void testAdd() {
        //Given
        double a = 14;
        double b = 2;

        //When
        double addResult = calculator.add(a, b);
        double subResult = calculator.sub(a, b);
        double mulResult = calculator.mul(a, b);
        double divResult = calculator.div(a, b);

        //Then
        Assert.assertEquals(16, addResult, 0);
        Assert.assertEquals(12, subResult, 0);
        Assert.assertEquals(28, mulResult, 0);
        Assert.assertEquals(7, divResult, 0);
    }
}
