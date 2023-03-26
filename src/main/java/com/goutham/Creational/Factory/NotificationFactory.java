package com.goutham.Creational.Factory;

public class NotificationFactory {
    private static Notification notification;

    public void setNotification(String str){
        if (str.equalsIgnoreCase("Email")) {
            notification= new EmailNotification();
        }
        else if (str.equalsIgnoreCase("SMS")) {
            notification=new SMSNotification();
        }
        else notification=null;
    }

    public void notifyUser(){
        try {
            notification.sendNotification();
        }
        catch (Exception e){
            System.out.println("not able to send this type of notification");
        }

    }
}
