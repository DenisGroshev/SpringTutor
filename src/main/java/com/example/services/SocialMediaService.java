package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SocialMediaService {
    private final EmailService emailService;

    @Autowired
    public SocialMediaService(EmailService emailService){
        this.emailService=emailService;
        System.out.println("SocialMediaService created with constructor injection");
    }

    public void postUpdate(String user, String update){
        System.out.println("Posting update for "+user+": "+update);
        emailService.sendEmail(user, "New post: "+update);
    }
}
