package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        List<int> numbers = new ArrayList<>();

        //When
        ((ArrayList) numbers).add(4);
        ((ArrayList) numbers).add(2);
        ((ArrayList) numbers).add(6);

        //Then
        ((ArrayList) numbers).getAverage();
    }
}
