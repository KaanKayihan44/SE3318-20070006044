package com.kaan.taskmanagement;


import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testAddAndCheckTask() {
        User user = new User("testuser", "test@mail.com");
        Task task = new Task("Task1", LocalDate.now());
        user.addTask(task);
        assertTrue(user.hasTask("Task1"));
    }
}

