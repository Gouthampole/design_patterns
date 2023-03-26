package com.goutham.Creational.Factory;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("sending Email Notification");
    }
}
