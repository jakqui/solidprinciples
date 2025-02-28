package com.h8h.solid_principles.lsp.good.racingcars;

public final class RacingCar extends Vehicle {
    
    @Override
    public double getInteriorWidth() {
        return this.getCockpitWidth();
    }

    public double getCockpitWidth() {
        return 0.8;
    }
}
