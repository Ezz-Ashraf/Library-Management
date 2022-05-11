/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.database;

/**
 *
 * @author ezz
 */
public abstract class User implements dataProcessing {
    String username;
    String password ;
    String email;
    String role;
    public void setUserName(String userName)
    {
    this.username=username;
    }
    public void setPassword(String userName)
    {
    this.password=password;
    }
    public void setEmail(String userName)
    {
    this.email=email;
    }
    public void setRole(String userName)
    {
    this.role=role;
    }
    @Override
    public void saveData() {
        
    }

    @Override
    public ArrayList<String> retrieveData(String ...userData) {
           
        String  query = "SELECT * FROM Users where userName = '"+userData[0]+"' and Upassword ='"+ userData[1]+"'";
     try {   
         ArrayList <String> gotData  =database.getModel(query,"role");
         System.out.println("Hi");

         return gotData;
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        ArrayList <String> error = new ArrayList();
            return error; 
        }
    }
    public String getRole ()
    {
    return this.role;
    }
     public abstract void startPage();
}
