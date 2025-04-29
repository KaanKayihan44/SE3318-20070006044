package com.kaan.taskmanagement;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void testAssignAndRemoveTask() {
        TaskManager tm = new TaskManager();
        User user = new User("user", "mail@mail.com");
        Task task = new Task("Task", LocalDate.now());

        tm.assignTask(user, task);
        assertEquals(1, tm.getTasksForUser(user).size());

        tm.removeTask(user, task);
        assertEquals(0, tm.getTasksForUser(user).size());
    }
}
