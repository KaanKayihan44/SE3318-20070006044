package com.kaan.taskmanagement;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<String, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    public void sendNotification(User user, String message) {
        notifications
                .computeIfAbsent(user.getUsername(), k -> new ArrayList<>())
                .add(message);
    }

    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user.getUsername(), new ArrayList<>());
    }
}
