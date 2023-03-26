package com.goutham.structural.composite.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{
    List<Box> Items=new ArrayList<>();

    public CompositeBox(Box... items) {
        Items.addAll(Arrays.asList(items));
    }
    public void addItem(Box box){
        Items.add(box);
    }

    public void removeItems(Box box){
        Items.remove(box);
    }

    @Override
    public double calculatePrice() {
        return Items.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
