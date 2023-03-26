package com.goutham.behavioural.observer;

import java.util.*;

public class NotificationService {
    Map<Event, List<User>> customers;
    private Notification notification;

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public NotificationService(){
        customers=new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event,new ArrayList<>()));
    }

    public void subscribe(Event event,User user){
        customers.get(event).add(user);
    }
    public void unSubscribe(Event event,User user){
        customers.get(event).remove(user);
    }

    public void notifyAll(Event event){
        for (User user:customers.get(event)){
            notification.notifyUsers(event,user);
        }
//        customers.get(event).forEach(notification -> notification.notifyUsers(event));
    }
}
