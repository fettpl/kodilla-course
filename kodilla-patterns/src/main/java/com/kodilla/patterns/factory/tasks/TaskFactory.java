package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task createTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Apples", 5.0);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "Purple", "Board");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "To the office", "Car");
            default:
                return null;
        }
    }
}
