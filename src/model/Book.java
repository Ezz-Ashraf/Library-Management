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
public class Book {
    private int bookId;
    private String bookName;
    private String publisher;
    private String publishYear;
    private float bookPrice;
    
    public void addBookId(int bookId)
    {
    this.bookId=bookId;
    }
    public void addBookName(String bookName)
    {
    this.bookName=bookName;
    }
   public void addPublisher(String publisher)
    {
    this.publisher=publisher;
    }
    public void addPublishYear(String publishYear)
    {
    this.publishYear=publishYear;
    }
    public void addBookPrice(float bookPrice)
    {
    this.bookPrice= bookPrice;
    }
    public int getBookId()
    {
    return this.bookId;
    }
    public String getBookName()
    {
    return this.bookName;
    }
    public String getPublisher()
    {
    return this.publisher;
    }
    public String getPublishYear()
    {
    return this.publishYear;
    }
    public float getBookPrice()
    {
    return this.bookPrice;
    }
    public void saveData()
    {
     /*String query=" insert into Student (StudentName, StudentID, email, StudentDepartment,StudentPhone ,StudentAddress) "
              + "values('"+"hgjg"+"', '"+4444+"', '"+"yjyjhgk"+"', '"+"CS"+"' , '"+"010"+" , "+"Helwan"+"')";
     */
      String  query = "INSERT INTO Book" +
            " (BookID,BookName,publisher,publishYear,price)" +
            " VALUES (?,?,?,?,?)";
      String args[]={getBookId()+"",getBookName(),getPublisher(),getPublishYear(), getBookPrice()+ ""};
     try {
            database.addModel(query,args);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
