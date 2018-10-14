package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkUpdateTestSuite {
    @Test
    public void updateTest() {
        // Given
        Mentor mentor1 = new Mentor("John", "Kovalsky");
        Mentor mentor2 = new Mentor("Stephanie", "Smith");
        TaskList student1Tasks = new TaskList("Adam", "Crane");
        TaskList student2Tasks = new TaskList("Julianna", "Doors");
        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor2);

        // When
        student1Tasks.addTask("Task #1");
        student2Tasks.addTask("Task #2");
        student1Tasks.addTask("Task #3");
        student1Tasks.addTask("Task #4");
        student2Tasks.addTask("Task #5");

        // Then
        assertEquals(3, mentor1.getCountTask());
        assertEquals(2, mentor2.getCountTask());
    }

    @Test
    public void testRemoveObservers() {
        // Given
        Mentor mentor1 = new Mentor("John", "Kovalsky");
        Mentor mentor2 = new Mentor("Stephanie", "Smith");
        TaskList student1Tasks = new TaskList("Adam", "Crane");
        TaskList student2Tasks = new TaskList("Julianna", "Doors");
        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor2);
        student1Tasks.removeObserver(mentor1);
        student1Tasks.registerObserver(mentor2);

        // When
        student1Tasks.addTask("Task #1");
        student2Tasks.addTask("Task #2");
        student1Tasks.addTask("Task #3");
        student1Tasks.addTask("Task #4");
        student2Tasks.addTask("Task #5");

        // Then
        assertEquals(0, mentor1.getCountTask());
        assertEquals(5, mentor2.getCountTask());
    }

    @Test
    public void testTwoObserversOneList() {
        // Given
        Mentor mentor1 = new Mentor("John", "Kovalsky");
        Mentor mentor2 = new Mentor("Stephanie", "Smith");
        TaskList student1Tasks = new TaskList("Adam", "Crane");
        TaskList student2Tasks = new TaskList("Julianna", "Doors");
        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor2);
        student1Tasks.registerObserver(mentor2);

        // When
        student1Tasks.addTask("Task #1");
        student2Tasks.addTask("Task #2");
        student1Tasks.addTask("Task #3");
        student1Tasks.addTask("Task #4");
        student2Tasks.addTask("Task #5");

        // Then
        assertEquals(3, mentor1.getCountTask());
        assertEquals(5, mentor2.getCountTask());
    }
}
