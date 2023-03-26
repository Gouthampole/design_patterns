package com.goutham.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Box{
    private String name;
    List<Box> items;

    public Composite(String name) {
        this.name = name;
        items=new ArrayList<>();
    }

    public void addItems(Box box){
        items.add(box);
    }
    public void removeItems(Box box){
        items.remove(box);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Box::getPrice).sum();
    }
}
