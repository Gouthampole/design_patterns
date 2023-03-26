package com.goutham.structural.composite.ex;

public class Main {
    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame("PS5",200000);
        Book book=new Book("Design patterns in java",450);
        Mobile mobile=new Mobile("Samsung",65000);
        Mobile mobile1=new Mobile("IPhone",150000);

        CompositeBox compositeBox=new CompositeBox(book,mobile1);
        System.out.println(compositeBox.calculatePrice());

        CompositeBox compositeBox1=new CompositeBox(compositeBox,videoGame,mobile);
        System.out.println(compositeBox1.calculatePrice());
    }
}
