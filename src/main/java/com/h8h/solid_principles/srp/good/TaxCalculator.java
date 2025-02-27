package com.h8h.solid_principles.srp.good;

public class TaxCalculator {
    public void calculateTax(Employee employee) {
        if (employee.getEmployeeType().equals("fulltime")) {
            // Calculate tax for fulltime employee
        }

        if (employee.getEmployeeType().equals("contract")) {   
            // Calculate tax for contract employee
        }
    }
}
