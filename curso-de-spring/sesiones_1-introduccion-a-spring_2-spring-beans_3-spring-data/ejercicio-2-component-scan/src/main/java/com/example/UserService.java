package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    UserService(NotificationService notificationService){
        System.out.println("UserService has been instantiated");
        this.notificationService = notificationService;
    }
}
