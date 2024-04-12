package com.example;

public class SmsService implements IMessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS - " + message);
    }

}
