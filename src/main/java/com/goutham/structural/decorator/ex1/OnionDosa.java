package com.goutham.structural.decorator.ex1;

public class OnionDosa extends DosaDecorator{
    public OnionDosa(Dosa dosa) {
        super(dosa);
    }
    @Override
    public String makeDosa() {
        return super.makeDosa()+" with Onions";
    }
}
