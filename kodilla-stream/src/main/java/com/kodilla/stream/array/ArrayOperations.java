package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        Stream<Integer> streamOfInts = Arrays.stream(numbers).boxed();
        streamOfInts.forEach(System.out::println);

        Stream<Integer> streamOfInts2 = Arrays.stream(numbers).boxed();
        OptionalDouble median = streamOfInts2
                .mapToDouble(i -> i)
                .average();

        double finalMedian = median.getAsDouble();

        System.out.println("The median for this set of numbers is: " + finalMedian);

        return finalMedian;
    }
}
