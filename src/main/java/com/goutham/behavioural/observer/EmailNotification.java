package com.goutham.behavioural.observer;

public class EmailNotification implements Notification{
    @Override
    public void notifyUsers(Event event,User user) {
        System.out.println("EMAIL NOTIFICATION!!!!  ALERT:"+event+" came into market");
        user.getMessage(event);

    }
}
