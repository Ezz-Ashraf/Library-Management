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
    private String phoneNumber;
    private String address;
    private Student(studentBuilder builder){
        this.department=builder.department;
        this.name=builder.name;
        this.id=builder.id;
        this.email=builder.email;
        this.phoneNumber=builder.phoneNumber;
        this.address=builder.address;
    }
    public static class studentBuilder
    {
    private String name;
    private int id;
    private String email;
    private String department;
    private String phoneNumber;
    private String address;
    public studentBuilder(String name,int id , String email ,String department)
    {
        this.name=name;
        this.id=id;
        this.email=email;
        this.department=department;
    }


    public studentBuilder addPhoneNumber(String phoneNumber)
    {
    this.phoneNumber=phoneNumber;
    return this;
    }
    public studentBuilder addAddress(String address)
    {
    this.address=address;
    return this;
    }
    public Student build() {
    return new Student(this);
    }
    }
    public String getName()
    {
    return this.name;
    }
    public int getId()
    {
    return this.id;
    }
    public String getEmail()
    {
    return this.email;
    }
    public String getDeparment()
    {
    return this.department;
    }
    public String getPhoneNumber()
    {
    return this.phoneNumber;
    }
    public String getAddress()
    {
    return this.address;
    }

    public void saveData()
    {
     /*String query=" insert into Student (StudentName, StudentID, email, StudentDepartment,StudentPhone ,StudentAddress) "
              + "values('"+"hgjg"+"', '"+4444+"', '"+"yjyjhgk"+"', '"+"CS"+"' , '"+"010"+" , "+"Helwan"+"')";
     */
      String  query = "INSERT INTO Student" +
            " (StudentName,StudentID,email,StudentDepartment,StudentPhone,StudentAddress)" +
            " VALUES (?,?,?,?,?,?)";
      String args[]={getName(),getId()+"",getEmail(),getDeparment(),getPhoneNumber(),getAddress()};
     try {
            database.addModel(query,args);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
