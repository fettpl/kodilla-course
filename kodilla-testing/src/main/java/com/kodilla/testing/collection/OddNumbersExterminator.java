package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers;
    ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator() {
        numbers = new ArrayList<Integer>();
        evenNumbers = new ArrayList<Integer>();
    }
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer number: numbers) {
            if((number % 2) == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Quantity of even numbers: " + evenNumbers.size() + ". Listed even numbers: " + evenNumbers + ".");

        return evenNumbers;
    }
}