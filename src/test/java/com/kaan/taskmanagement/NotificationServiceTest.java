package com.kaan.taskmanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void testSendAndRetrieveNotification() {
        NotificationService ns = new NotificationService();
        User user = new User("user", "email@mail.com");

        ns.sendNotification(user, "New task assigned.");
        assertEquals(1, ns.getNotifications(user).size());
    }
}
