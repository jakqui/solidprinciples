package com.h8h.solid_principles.lsp.good.racingcars;

public final class Car extends Vehicle {
    
    @Override
    public double getInteriorWidth() {
        return this.getCabinWidth();
    }

    public double getCabinWidth() {
        return 1.8;
    }
}
