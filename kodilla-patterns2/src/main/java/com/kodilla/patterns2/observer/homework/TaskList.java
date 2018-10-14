package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {
    private final String studentFirstname;
    private final String studentLastname;
    private final List<String> tasks;
    private final List<Observer> observers;

    public TaskList(String studentFirstname, String studentLastname) {
        this.studentFirstname = studentFirstname;
        this.studentLastname = studentLastname;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
