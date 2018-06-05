package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int taskCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue, Task task) {
        System.out.println(username + ": New task: " + task.getName() + " sent by " + taskQueue.getUsername());
        taskCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
