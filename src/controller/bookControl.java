/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Book;
import java.util.*;

/**
 *
 * @author ezz
 */
public class bookControl {
      public static boolean addBook(int bookId, float bookPrice ,String bookName, String publisher , String publishYear)
    {
           
       Book addedBook  = new Book();
       addedBook.addBookId(bookId);
       addedBook.addBookName(bookName);
       addedBook.addPublisher(publisher);
       addedBook.addPublishYear(publishYear);
       addedBook.addBookPrice(bookPrice);
       addedBook.saveData();
    return true;
    }
      public static boolean bookExist(String id){
        Book checkId=new Book();
        int indexOfIdColumn=0;
        String BookId=(checkId.retrieveData(id)).get(indexOfIdColumn);
     
        return (BookId.equals(id));
    }
      public static ArrayList<String[]> showAvailableBooksTable(){
            Book data=new Book();
            ArrayList<String[]> bookstable=data.getBookTable();
            return bookstable;
        }
}
