package com.goutham.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        User user1=new User("Goutham");
        User user2=new User("Uttej");
        User user3=new User("Pruthvi");
        User user4=new User("Naidu");

        NotificationService notificationService=new NotificationService();
        notificationService.setNotification(new SMSNotification());
        notificationService.subscribe(Event.IPhone14,user1);
        notificationService.subscribe(Event.IPhone14,user3);
        notificationService.setNotification(new EmailNotification());
        notificationService.subscribe(Event.Mustang_84g,user2);
        notificationService.subscribe(Event.Mustang_84g,user4);
        notificationService.notifyAll(Event.IPhone14);



    }
}
