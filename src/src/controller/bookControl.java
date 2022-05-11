/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Book;

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
}
