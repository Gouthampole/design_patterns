package com.goutham.Creational.Factory;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("sending SMS Notification");
    }
}
