/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jacka
 */
public class MySQLConnection {
    

public static void main(String[] args) { 
    try{
        Class.forName ("com.mysql.cj.jdbc.Driver");

    }catch (ClassNotFoundException e){
        System.out.println(e);
    }   
    final String ID="wyoung10";
    final String PW = "COSC*nv8kr";
    final String SERVER="jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/"+ID+"db";
    
    try{
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery ("Select * from wyoung10db.Mat_Employee");
        while (rs.next()) {
        String empId = rs.getString ("EmployeeID");
        String fName = rs.getString ("Fname");
        String lName = rs.getString ("Lname");
        int age = rs.getInt("Age");
        double wage = rs.getDouble("Wage");
        String date = rs.getString("HireDate");
        System.out.println (empId+", "+fName+", "+lName+", "+age+", "+ wage+", "+ date);
        }
    }catch (SQLException e){
        System.err.println (e);
    }

}
}

