package com.kaan.taskmanagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean hasTask(String title) {
        return tasks.stream().anyMatch(task -> task.getTitle().equals(title));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}