package com.example.services;

public class NotificationService {
    private EmailService emailService;
    private SmsService smsService;

    public void setEmailService(EmailService emailService){
        this.emailService=emailService;
    }
    public void setSmsService (SmsService smsService){
        this.smsService=smsService;
    }
    public void notifyUser(String email, String phone, String message){
        emailService.sendEmail(email, message);
        smsService.sendSMS(phone, message);
    }
}
