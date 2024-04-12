package com.example;

public class NotificationService {
    private IMessageService messageService;

    NotificationService(IMessageService iMessageService){
        this.messageService = iMessageService;
    }

    public void sendNotification(String message){
        messageService.sendMessage(message);
    }
}
