package com.goutham.structural.decorator.ex1;

public class Main {
    public static void main(String[] args) {
        Dosa dosa=new PlainDosa();
        System.out.println(dosa.makeDosa());

        DosaDecorator decorator=new MasalaDosa(new OnionDosa(new PlainDosa()));
        System.out.println(decorator.makeDosa());
    }
}
