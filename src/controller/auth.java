/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
     if (!role.equals("error"))
     {
         if(role.equals("Admin"))
         {
         User admin = new Admin() ;
         admin.startPage();
         }
         else
         {
         User student = new Student();
         
         student.startPage();
         }
  return true;
     }
     return false;
 }
}
