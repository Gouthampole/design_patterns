package com.goutham.Creational.Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory=new NotificationFactory();
        factory.setNotification("sms");
        //or can also return notification type like
//        notification=factory.createNotification("sms"); where createNotification returns the instance
        factory.notifyUser();
    }
}
