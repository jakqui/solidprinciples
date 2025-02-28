package com.h8h.solid_principles.lsp.good.racingcars;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {
    public static void main(String[] args) {
        Vehicle first = new Car();
        Vehicle second = new Car();
        Vehicle third = new RacingCar();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(first);
        vehicles.add(second);
        vehicles.add(third);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInteriorWidth());
        }
    }
}
