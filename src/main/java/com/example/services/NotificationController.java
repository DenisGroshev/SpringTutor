package com.example.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notify")
    public String sendNotification() {
        notificationService.notifyUser(
                "user@example.com",
                "+1234567898",
                "Hello from Spring Boot Starter"
        );
        return "Notification sent!";
    }
}