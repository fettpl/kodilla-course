package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return null;
    }

    @Override
    public String getTaskName() {
        return null;
    }

    @Override
    public Boolean isTaskExecuted() {
        return null;
    }
}
