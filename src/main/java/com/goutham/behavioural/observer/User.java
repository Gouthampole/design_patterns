package com.goutham.behavioural.observer;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public void getMessage(Event event){
        System.out.println("go on.."+name);
    }
}
