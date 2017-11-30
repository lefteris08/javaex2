/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draftjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lefte
 */
public class Diabasmakaiorasi {static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/catalog";
    static final String USER = "root";
    static final String PASS = "admin";

    public void Diabasmakaiorasi() {
        // TODO code application logic here
        Connection conn = null;
        Statement stmt = null;

        System.out.println("Connecting to database...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");  
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(kodikas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            //Logger.getLogger(kodikas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {if (conn==null){
        
            System.out.println("wtf");
        }
           stmt = conn.createStatement();
        } catch (SQLException ex) {
           // Logger.getLogger(kodikas2.class.getName()).log(Level.SEVERE, null, ex);
        }
// System.out.println("den paizei");
       
        System.out.println("Creating statement...");
        String sql;
        sql = "SELECT * From members";
        ResultSet rs;
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print("First1: " + rs.getString(1));
                System.out.print(", LastName : " + rs.getString(2));
                System.out.print(", Til1 : " + rs.getString(4));
                System.out.print(", Til2 : " + rs.getString(5));
                System.out.println(", id" + rs.getInt(3));

            }

        } catch (SQLException ex) {
         //   Logger.getLogger(kodikas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("egine");
    }
    
}
