package com.kodilla.exception.test;

import com.kodilla.exception.test.ExceptionHandling;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(4.2, 2.2);
        } catch (ExceptionHandling e) {
            System.out.println("Problem with the data!");
        }
    }
}