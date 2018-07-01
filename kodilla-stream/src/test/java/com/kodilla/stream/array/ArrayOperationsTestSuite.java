package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 6;
        numbers[2] = 5;
        numbers[3] = 5;
        numbers[4] = 2;

        //When
        double testedMedian = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4.4, testedMedian, 0.1);
    }
}
