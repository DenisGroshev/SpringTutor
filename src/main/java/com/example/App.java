package com.example;

import com.example.config.AppConfig;
import com.example.services.NotificationService;
import com.example.services.SocialMediaService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        System.out.println("------XML config-------");
        ApplicationContext xmlContext=new ClassPathXmlApplicationContext("appContext.xml");

        NotificationService notificationService= xmlContext.getBean("notificationService", NotificationService.class);
        notificationService.notifyUser("denis@groshev.com", "+79370404092", "Hello from XML config");

        SocialMediaService socialMediaService=xmlContext.getBean(SocialMediaService.class);
        socialMediaService.postUpdate("Denis_Groshev", "My first Post");

        // Java config

        System.out.println("-------------Java configuration---------");
        ApplicationContext javaContext=new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationService javaNotifyController=javaContext.getBean(NotificationService.class);
        javaNotifyController.notifyUser("denis@groshev.com", "+79370404092", "Hello from java config");


    }
}
