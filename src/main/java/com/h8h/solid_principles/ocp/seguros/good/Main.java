package com.h8h.solid_principles.ocp.seguros.good;

public class Main {
    public static void main(String[] args) {
        // Tipo de seguro 
        String insuranceType = "VEHICLE"; //"HEALTH"
        // Objeto en base al tipo de seguro
        CustomerProfile customerProfile = CustomerProfileFactory.createCustomerProfile(insuranceType);

        //Calculamos el descuento
        InsurancePremiumDiscountCalculator calculator = new InsurancePremiumDiscountCalculator();
        int discount = calculator.calculatePremiumDiscountPercent(customerProfile);
        System.out.println("Descuento aplicado: " + discount + "%");
    }
}