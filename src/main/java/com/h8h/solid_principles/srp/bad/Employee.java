package com.h8h.solid_principles.srp.bad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.h8h.solid_principles.srp.MyUtils;

public class Employee {
    private String employedId;
    private String employeeName;
    private String employeAddress;
    private String contactNumber;
    private String employeeType;

    public void save() {
        // Serializable object into a string representation
        String objectStr = MyUtils.serializeIntoAString(this);
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB ", "root", "password");
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO employee values('" + objectStr + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void calculateTax() {
        if (this.getEmployeeType().equals("fulltime")) {
            // Calculate tax for fulltime employee
        }

        if (this.getEmployeeType().equals("contract")) {   
            // Calculate tax for contract employee
        }
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
