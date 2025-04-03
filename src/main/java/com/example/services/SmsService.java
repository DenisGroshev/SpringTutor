package com.example.services;

public interface SmsService {
    void sendSMS(String phone, String message);
}
class SmsServiceImpl implements SmsService{

    @Override
    public void sendSMS(String phone, String message) {
        System.out.println("Sending SMS to "+phone+": "+message);
    }
}
