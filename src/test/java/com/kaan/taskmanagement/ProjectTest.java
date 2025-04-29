package com.kaan.taskmanagement;


import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void testAddAndRetrieveTask() {
        Project project = new Project();
        Task task = new Task("Find Me", LocalDate.now());
        project.addTask(task);
        assertEquals(task, project.getTaskByTitle("Find Me"));
    }
}

