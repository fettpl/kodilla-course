package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double triangleHeight;
    double triangleBase;

    public Triangle(double triangleHeigh, double triangleBase) {
        this.triangleHeight = triangleHeigh;
        this.triangleBase = triangleBase;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "triangleHeigh=" + triangleHeight +
                ", triangleBase=" + triangleBase +
                '}';
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (0.5 * triangleBase) * triangleHeight;
    }
}