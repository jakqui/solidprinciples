package com.h8h.solid_principles.ocp.seguros.good;

public class HouseInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return false;
    }
}