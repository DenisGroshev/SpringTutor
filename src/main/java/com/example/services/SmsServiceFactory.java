package com.example.services;


public class SmsServiceFactory {
    public static SmsService createSmsService() {
        System.out.println("Creating SmsService via factory method");
        return new SmsServiceImpl();
    }
}