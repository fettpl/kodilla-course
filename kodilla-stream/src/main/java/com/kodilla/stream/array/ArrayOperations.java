package com.kodilla.stream.array;

import java.util.Arrays;

public interface ArrayOperations {
    static String getAverage(int[] numbers) {
        Arrays.stream(numbers).forEach(System.out::println);

        return "OK";

        /*
        int sumOfNumbers = Arrays.stream(numbers).sum();

        double median = (double) sumOfNumbers / numbers.length()

        return median;
        */
    }
}
