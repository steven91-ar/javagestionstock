/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author steve
 */
public class Conexion {
    Connection con;
    
    public Connection getConnection () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "");
            return con;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }
    
}
