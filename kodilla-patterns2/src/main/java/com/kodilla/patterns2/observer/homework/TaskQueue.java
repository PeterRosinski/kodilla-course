package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final List<Observer> observers;
    private final List<Task> tasks;
    private final String username;

    public TaskQueue(String username) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.username = username;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers(task);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Task task) {
        for (Observer observer : observers) {
            observer.update(this, task);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Task> getMessages() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }
}
