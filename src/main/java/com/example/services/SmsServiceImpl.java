package com.example.services;


public class SmsServiceImpl implements SmsService {
    @Override
    public void sendSMS(String phone, String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}