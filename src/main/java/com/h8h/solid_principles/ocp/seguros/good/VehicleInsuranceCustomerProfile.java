package com.h8h.solid_principles.ocp.seguros.good;

import java.util.Random;

public class VehicleInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}