package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask() {
        System.out.println("Task added!");
    }
}
