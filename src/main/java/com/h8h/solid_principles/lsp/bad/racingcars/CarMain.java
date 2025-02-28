package com.h8h.solid_principles.lsp.bad.racingcars;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car fisst = new Car();
        Car second = new Car();
        Car third = new RacingCar();

        List<Car> cars = new ArrayList<>();
        cars.add(fisst);
        cars.add(second);
        cars.add(third);

        for (Car car : cars) {
            System.out.println(car.getCabinWidth());
        }
    }
}
