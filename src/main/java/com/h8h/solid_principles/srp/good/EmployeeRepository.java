package com.h8h.solid_principles.srp.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.h8h.solid_principles.srp.MyUtils;

public class EmployeeRepository {
    
    public void save(Employee employee) {
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
}
