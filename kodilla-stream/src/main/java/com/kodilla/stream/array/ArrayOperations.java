package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static int getAverage(int[] numbers) {
        List<int> numbers = new ArrayList<>();
        List<int> numbersList = IntStream.range(0, ((ArrayList) numbers).getList());

        double median = (double) IntStream.range(0, ((ArrayList) numbers).average());
    }
}
