package com.kodilla.testing.shape;

public class Circle implements Shape {
    double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                '}';
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return circleRadius * circleRadius * 3.14;
    }
}