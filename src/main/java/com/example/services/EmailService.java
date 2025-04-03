package com.example.services;

public class EmailService {
    private final String server;
    private final int port;

    public EmailService(String server, int port) {
        this.server = server;
        this.port = port;
        System.out.println("EmailService create with server: "+server+", port: "+port);
    }
    public void sendEmail(String to, String message){
        System.out.println("Sending email to: "+to+": "+message);
    }
}
