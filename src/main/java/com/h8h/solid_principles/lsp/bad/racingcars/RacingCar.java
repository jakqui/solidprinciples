package com.h8h.solid_principles.lsp.bad.racingcars;

public final class RacingCar extends Car {
    
    @Override
    public double getCabinWidth() {
        throw new UnsupportedOperationException("Los autos de carrera no tienen cabina.");
    }

    public double getCockpitWidth() {
        return 0.0;
    }
}
