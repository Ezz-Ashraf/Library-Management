/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import libraryManagement.view.adminHome;
import libraryManagement.view.studentHome;
import utility.database;

/**
 *
 * @author omark
 */
public class Student extends User implements dataProcessing {
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
    public Student()
    {
    }
        @Override
    public ArrayList<String> retrieveData(String... condition) {
 ArrayList <String> studentData=new ArrayList();
  try {
            int idIndex=0;
            String query="select * from Student where StudentID ="+Integer.parseInt(condition[idIndex]);
            studentData=database.getModel(query);
            return studentData ;
        } catch (SQLException ex) {
            studentData.add("not found");
            return studentData;
        }
        
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

    @Override
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
    
    @Override
    public void startPage()
    {
    new studentHome().setVisible(true);
    }
    
}
