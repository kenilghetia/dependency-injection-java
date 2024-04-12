package com.example;

public class EmailService implements IMessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email - "+ message);
    }
    
}
