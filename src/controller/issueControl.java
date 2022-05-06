/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Issue;

/**
 *
 * @author ezz
 */
public class issueControl {
        public static boolean addIssue(int bookId, int studentId , String issueDate , String dueDate )
    {
           
       Issue addedIssue  = new Issue();
       addedBook.addBookId(bookId);
       addedBook.addBookName(bookName);
       addedBook.addPublisher(publisher);
       addedBook.addPublishYear(publishYear);
       addedBook.addBookPrice(bookPrice);
       addedBook.saveData();
    return true;
    }
}
