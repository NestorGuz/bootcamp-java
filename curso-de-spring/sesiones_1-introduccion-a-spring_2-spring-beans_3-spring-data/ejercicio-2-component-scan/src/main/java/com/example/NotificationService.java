package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("NotificationService has been instantiated.");
    }

    public void sayHello(){
        System.out.println("Hello from Notification Service!");
    }
}
