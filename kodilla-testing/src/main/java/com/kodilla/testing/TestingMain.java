package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("User test: OK");
        } else {
            System.out.println("User test: Error!");
        }

        Calculator calculator = new Calculator();
        Integer addResult = calculator.add(4, 2);
        Integer substractResult = calculator.subtrackt(4, 2);

        if (addResult == 6) {
            System.out.println("Calculator add test: OK");
        } else {
            System.out.println("Calculator add test: Error!");
        }

        if (substractResult == 2) {
            System.out.println("Calculator substract test: OK");
        } else {
            System.out.println("Calculator substract test: Error!");
        }
    }
}