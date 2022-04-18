/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.database;

/**
 *
 * @author omark
 */
public class Student {
    private String name;
    private int id;
    private String email;
    private String department;
    public Student(){
    //    this.department=department;
    //      this.name=name;
    //    this.id=id;
    //    this.email=email;
    }
    public void addName(String name)
    {
    this.name=name;
    }
    public void addId(int id)
    {
    this.id=id;
    }
    public void addEmail(String email)
    {
    this.email=email;
    }
    public void addDepartment(String department)
    {
    this.department=department;
    }
    public void saveData()
    {
     String query=" insert into Student (StudentName, StudentId, email, StudentDepartment) "
              + "values('"+name+"', '"+id+"', '"+email+"', '"+department+"')";
        try {
            database.addModel(query);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
