package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorFirstname;
    private final String mentorLastname;
    private int countTask;

    public Mentor(String mentorFirstname, String mentorLastname) {
        this.mentorFirstname = mentorFirstname;
        this.mentorLastname = mentorLastname;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println(taskList.getStudentFirstname() + " " + taskList.getStudentLastname() + " added task");
        countTask++;
    }

    public int getCountTask() {
        return countTask;
    }
}
