package com.h8h.solid_principles.srp.good;

public class Employee {
    private String employedId;
    private String employeeName;
    private String employeAddress;
    private String contactNumber;
    private String employeeType;

    public void save() {
        new EmployeeRepository().save(this);
    }

    public void calculateTax() {
        new TaxCalculator().calculateTax(this);
    }

    public String getEmployedId() {
        return employedId;
    }

    public void setEmployedId(String employedId) {
        this.employedId = employedId;
    }

    public String getEmployeeName() {
        return employeeName;
    }  

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeAddress() {
        return employeAddress;
    }

    public void setEmployeAddress(String employeAddress) {  
        this.employeAddress = employeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }


}

