package com.kaan.taskmanagement;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testMarkAsCompleted() {
        Task task = new Task("Test", LocalDate.now());
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    void testIsOverdue() {
        Task task = new Task("Old Task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }
}
