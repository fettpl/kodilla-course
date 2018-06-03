package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigure() {

        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(11.5, 12.8);
        Circle circle = new Circle(12);
        Square square = new Square(6);

        // When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        // Then
        Assert.assertEquals(3, shapeCollector.shapes.size());
        System.out.println("Triangle field: " + triangle.getField() + "\nCircle field: " + circle.getField() + "\nSquare field: " + square.getField());
    }

    @Test
    public void removeFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(11.5, 12.8);

        // When
        shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    public void getFigure() {

        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(11.5, 12.8);
        Circle circle = new Circle(12);
        Square square = new Square(6);

        // When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.getFigure(2);

        // Then
        Assert.assertEquals(shapeCollector.shapes.get(2), shapeCollector.getFigure(2));
    }

    @Test
    public void showFigures() {

        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(11.5, 12.8);
        Circle circle = new Circle(12);
        Square square = new Square(6);

        // When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //Then
        shapeCollector.showFigures();
    }
}
