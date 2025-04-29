package com.kaan.taskmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<String, List<Task>> userTasks;

    public TaskManager() {
        this.userTasks = new HashMap<>();
    }

    public void assignTask(User user, Task task) {
        userTasks
                .computeIfAbsent(user.getUsername(), k -> new ArrayList<>())
                .add(task);
        user.addTask(task);
    }

    public void removeTask(User user, Task task) {
        List<Task> tasks = userTasks.get(user.getUsername());
        if (tasks != null) {
            tasks.remove(task);
        }
        user.getTasks().remove(task);
    }

    public List<Task> getTasksForUser(User user) {
        return userTasks.getOrDefault(user.getUsername(), new ArrayList<>());
    }
}
