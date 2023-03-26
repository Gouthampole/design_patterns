package com.goutham.structural.decorator.ex1;

public class DosaDecorator implements Dosa{
    private Dosa dosa;

    public DosaDecorator(Dosa dosa) {
        this.dosa = dosa;
    }

    @Override
    public String makeDosa() {
        return dosa.makeDosa();
    }
}
