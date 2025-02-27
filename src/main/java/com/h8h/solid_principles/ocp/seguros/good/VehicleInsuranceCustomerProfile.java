package com.h8h.solid_principles.ocp.seguros.good;

public class VehicleInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return true;
    }
}