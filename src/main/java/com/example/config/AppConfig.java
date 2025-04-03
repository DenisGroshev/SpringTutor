package com.example.config;

import com.example.services.EmailService;
import com.example.services.NotificationService;
import com.example.services.SmsService;
import com.example.services.SmsServiceFactory;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public EmailService emailService(){
        return new EmailService("smtp.config.example.com", 587);
    }
    @Bean
    public SmsService smsService(){
        return SmsServiceFactory.createSmsService();
    }
    @Bean
    public NotificationService notificationController(){
        NotificationService controller=new NotificationService();
        controller.setEmailService(emailService());
        controller.setSmsService(smsService());
        return controller;
    }
}
