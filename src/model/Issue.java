/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
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
    @Override
    public void saveData(){
           String  query = "INSERT INTO Issue" +
            " (BookID,StudentID,issueDate,dueDate,Status)" +
            " VALUES (?,?,?,?,?)";
      String args[]={getBookId()+"",getStudentId()+"",getIssueDate(),getDueDate(),"Issued"};
     try {
            database.addModel(query,args);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void retrieveData() {
    }
    }

