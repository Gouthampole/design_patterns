package com.goutham.structural.decorator.ex1;

public class MasalaDosa extends DosaDecorator{
    public MasalaDosa(Dosa dosa) {
        super(dosa);
    }

    @Override
    public String makeDosa() {
        return super.makeDosa()+" with Masala";
    }
}
