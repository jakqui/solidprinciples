package com.h8h.solid_principles.lsp.good.racingcars;

public sealed class Vehicle permits Car, RacingCar {
    public double getInteriorWidth() {
        return 0.0;
    }
}
