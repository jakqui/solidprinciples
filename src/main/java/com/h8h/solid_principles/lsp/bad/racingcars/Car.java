package com.h8h.solid_principles.lsp.bad.racingcars;

public sealed class Car permits RacingCar {
    
    public double getCabinWidth() {
        return 1.8;
    }

}
