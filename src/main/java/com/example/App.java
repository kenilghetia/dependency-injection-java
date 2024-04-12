package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // IMessageService emailService = new EmailService();
        // IMessageService smsService = new SMSService();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        NotificationService emailService = (NotificationService) context.getBean("emailNotification");
        NotificationService smsService = (NotificationService) context.getBean("smsNotification");

        emailService.sendNotification("Hello This is Email Notification");
        smsService.sendNotification("Hello This is SMS Notification");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
