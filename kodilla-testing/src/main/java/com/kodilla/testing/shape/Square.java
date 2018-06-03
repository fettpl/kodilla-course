package com.kodilla.testing.shape;

public class Square implements Shape {
    double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareSide=" + squareSide +
                '}';
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return  squareSide * squareSide;
    }
}