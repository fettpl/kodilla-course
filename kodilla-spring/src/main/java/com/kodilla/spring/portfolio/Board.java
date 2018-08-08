package com.kodilla.spring.portfolio;

public class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDoList() {
        toDoList.addTask();
    }

    public void addTaskInProgressList() {
        inProgressList.addTask();
    }

    public void addTaskDoneList() {
        doneList.addTask();
    }
}
