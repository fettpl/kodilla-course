package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    displayValue(double val) {
        System.out.println(val);
        return val;
    }
}
