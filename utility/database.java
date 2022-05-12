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
import model.Student;


/**
 *
 * @author ezz
 */
public class database {
    static String url =  "jdbc:sqlserver://DESKTOP-3S7Q7L2\\SQLEXPRESS:1433;databaseName=libraryManagement;integratedSecurity=true;" +
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
  
    public static ArrayList<String> getModel(String getQuery  ,String columnWanted) throws SQLException {
            ArrayList <String> arr=new ArrayList();
        try {
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c      = DriverManager.getConnection(url);
            Statement ss = c.createStatement();
            String query =getQuery;
            ResultSet r = ss.executeQuery(query);
            ResultSetMetaData rsmd = r.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
            System.out.println(columnsNumber);
                    r.next(); 
            for (int i = 1; i <= columnsNumber; i++) {                 
                arr.add(r.getString(i));
            }
            
           
             return    arr ;

   }
             
        catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
 return arr;
            }
  }
    public static String updateModel(String updateQuery ) throws SQLException {
            try {
    Connection c      = DriverManager.getConnection(url);
    Statement ss = c.createStatement();
    ss.execute(updateQuery);
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//ss.execute(query);
     
        return   "Model Updated succesfully";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return "Error in Updating the Model";
        }
    }
        public static String getRole(String username , String password) {
              String  query = "SELECT userRole FROM Users where userName = '"+username+"' and Upassword ='"+ password+"'";
     try {
            Connection c      = DriverManager.getConnection(url);
            Statement ss = c.createStatement();
            ResultSet r = ss.executeQuery(query);
            r.next(); 
        return     r.getString("userRole"); 
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
        }
  }


    