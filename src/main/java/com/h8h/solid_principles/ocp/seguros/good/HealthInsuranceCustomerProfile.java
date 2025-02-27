package com.h8h.solid_principles.ocp.seguros.good;

public class HealthInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return true;
    }
}