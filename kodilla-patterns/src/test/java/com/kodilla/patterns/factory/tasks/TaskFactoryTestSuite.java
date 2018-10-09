package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();

        // Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();

        // Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();

        // Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
