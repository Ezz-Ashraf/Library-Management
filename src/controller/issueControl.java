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
       addedIssue.addBookId(bookId);
       addedIssue.addStudentId(studentId);
       addedIssue.addIssueDate(issueDate);
       addedIssue.addDueDate(dueDate);
       //addedIssue.addStatus("issued");
       addedIssue.saveData();
    return true;
    }
}
