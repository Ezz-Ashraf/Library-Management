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
public class Issue implements dataProcessing {

    private int bookId;
    private int studentId;
    private String issueDate;
    private String dueDate;
    private String issueStatus;
    private String returnDate;

    public void addBookId(int bookId) {
        this.bookId = bookId;
    }

    public void addStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void addIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void addDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public void addStatus(String status){
        this.issueStatus=status;
    }
       public void addReturnDate(String returnDate){
           this.returnDate=returnDate;
       }

    public int getBookId() {
        return this.bookId;
    }
    public int getStudentId() {
        return this.studentId;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }
    public String getIssueStatus(){
        return this.issueStatus;
    }
        public String getReturnDate(){
        return this.returnDate;
    }
    @Override
    public void saveData(){
           String  query = "INSERT INTO Issue" +
            " (BookID,StudentID,issueDate,dueDate,Status)" +
            " VALUES (?,?,?,?,?)";
      String args[]={getBookId()+"",getStudentId()+"",getIssueDate(),getDueDate(),getIssueStatus()};
     try {
            database.addModel(query,args);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateData(){
        String  updateStatusQuery ="update Issue set Status='"+this.getIssueStatus()+"' where BookId='"+this.getBookId()+"'and StudentId='"+this.getStudentId()+"'";
        String  updateDateQuery="update Issue set returndate='"+this.returnDate+"' where BookId='"+this.getBookId()+"'and StudentId='"+this.getStudentId()+"'";
        try {
            database.updateModel(updateStatusQuery);
            database.updateModel(updateDateQuery);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<String> retrieveData(String ... selectors) {
         
      ArrayList <String> studentData=new ArrayList();
  try {
            int bookIdIndex=0;
            int statusIndex=1;
            String query="select * from Issue where BookId ='"+Integer.parseInt(selectors[bookIdIndex])+"'and Status ='"+selectors[statusIndex]+"'";
            studentData=database.getRecord(query);
            return studentData ;
        } catch (SQLException ex) {
            studentData.add("not found");
            return studentData;
        }
        
    }
    public ArrayList<String[]> getIssuesTable(){
        ArrayList<String[]> issueData = database.getTableInfo("select * from Issue");
        return issueData;
    }
    }
    

