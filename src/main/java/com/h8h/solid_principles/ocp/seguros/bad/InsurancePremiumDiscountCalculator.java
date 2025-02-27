package com.h8h.solid_principles.ocp.seguros.bad;

public class InsurancePremiumDiscountCalculator {
    public int calculatePremiumDiscountPercent(HealtInsuranceCustomerProfile customer) {
       if (customer.isLoyalCustomer()) {
           return 20;
       }
       return 0;
    }

    public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}
