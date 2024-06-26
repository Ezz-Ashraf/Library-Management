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
public class Book implements dataProcessing {
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
    @Override
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

    @Override
   public ArrayList<String> retrieveData(String... condition) {
 ArrayList <String> studentData=new ArrayList();
  try {
            int idIndex=0;
            String query="select * from Book where BookID ="+Integer.parseInt(condition[idIndex]);
            studentData=database.getRecord(query);
            return studentData ;
        } catch (SQLException ex) {
            studentData.add("not found");
            return studentData;
        }
        
    }
   public ArrayList<String[]> getBookTable(){
        ArrayList<String[]> issueData = database.getTableInfo("select * from Book");
        return issueData;
    }
}
