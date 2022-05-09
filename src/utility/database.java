/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ezz
 */
public class database {
    static String url =  "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=libraryManagement;integratedSecurity=true;" +
     "encrypt=true;trustServerCertificate=true"; ;
  public static String addModel(String addQuery , String ...args) throws SQLException {
            try {
    Connection c      = DriverManager.getConnection(url);
    PreparedStatement stmt = c.prepareStatement(addQuery);
    Statement ss = c.createStatement();
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String query = addQuery;
                for (int i = 0; i < args.length; i++) {
                   stmt.setString(i+1, args[i]);
                }
                stmt.execute();
//ss.execute(query);
     
        return   "Model added succesfully";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return "Error in adding the Model";
        }
  }
  
    public static void getModel(String getModel) throws SQLException {
        try {
            // TODO code application logic here
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c      = DriverManager.getConnection(url);
            Statement ss = c.createStatement();
            String query = "SELECT * FROM [Sales].[dbo].[Orders] ";
            ResultSet r = ss.executeQuery(query);
            while(r.next()) {
         System.out.println(r.getString(1) + "---" + r.getString(2) + "---" + r.getString(3) +"----" + r.getString(4) + "----" +r.getString(5));
            }
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
  }
}


