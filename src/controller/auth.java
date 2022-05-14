/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Admin;
import model.Student;
import model.User;
import utility.database;

/**
 *
 * @author ezz
 */
public class auth {
 public static boolean checkLogin(String username,String password) 
 {
     
     String role =database.getRole(username,password);
     System.out.println(role);
     if (!role.equalsIgnoreCase("error"))
     {
         if(role.equalsIgnoreCase("Admin"))
         {
         User admin = new Admin() ;
         String [] userData = {username,password};
           ArrayList <String> adminData=admin.retrieveData(userData);
         
         admin.setUserName(adminData.get(1));
         admin.setPassword(adminData.get(2));
         admin.setEmail(adminData.get(3));
         admin.setRole(adminData.get(4));
         admin.startPage();
         }
         else
         {
         User student = new Student();
                  String [] userData = {username,password};
           ArrayList <String> adminData=student.retrieveData(userData);
         student.setUserName(adminData.get(1));
         student.setPassword(adminData.get(2));
         student.setEmail(adminData.get(3));
         student.setRole(adminData.get(4));
         student.startPage();
         }
  return true;
     }
     return false;
 }
}
