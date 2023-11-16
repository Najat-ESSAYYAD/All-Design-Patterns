package Decorateur;

import Composants.Boisson;

public  class Lait extends Decorateur {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au  Lait";
    }

    @Override
    public double cout() {
        return 2+ boisson.cout();
    }
}
