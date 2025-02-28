
package com.h8h.solid_principles.ocp.seguros.good;

public class CustomerProfileFactory {
    public static CustomerProfile createCustomerProfile(String insuraceType) {
        switch (insuraceType) {
            case "HEALTH":
                return new HealthInsuranceCustomerProfile();
            case "HOUSE":
                return new HouseInsuranceCustomerProfile();
            case "VEHICLE":
                return new VehicleInsuranceCustomerProfile();
            default:
                throw new IllegalArgumentException("Tipo de seguro no válido: " + insuraceType);
        }
    }
}