package com.goutham.behavioural.observer;

public class SMSNotification implements Notification{
    @Override
    public void notifyUsers(Event event,User user) {
        System.out.println("SMS NOTIFICATION!!!!  ALERT:"+event+" came into market");
        user.getMessage(event);


    }
}
