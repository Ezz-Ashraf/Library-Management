/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Issue;

/**
 *
 * @author omark
 */
public class issueControl {
        public static boolean addIssue(int bookId, int studentId , String issueDate , String dueDate )
    {
           
       Issue addedIssue  = new Issue();
       addedIssue.addBookId(bookId);
       addedIssue.addStudentId(studentId);
       addedIssue.addIssueDate(issueDate);
       addedIssue.addDueDate(dueDate);
       addedIssue.addStatus("issued");
       addedIssue.saveData();
    return true;
    }
        public static boolean returnBook(int bookId, int studentId , String returnDate )
    {
           
       Issue addedIssue  = new Issue();
       addedIssue.addBookId(bookId);
       addedIssue.addStudentId(studentId);
       addedIssue.addReturnDate(returnDate);
       addedIssue.addStatus("Returned");
       addedIssue.updateData();
    return true;
    }
        public static boolean acceptIssue(String bookId,String studentId){
            if(studentControl.studentIdExist(studentId)&&bookControl.bookExist(bookId)&&!isissued(bookId)){
                return true;
            }
            else{
                return false;
            }
        }
        public static boolean isissued(String bookId){
            Issue checkIssue=new Issue();
            int bookIdIndex=0;
            int studentIdIndex=1;
            int issueStatusIndex=3;
            String [] issueAttributes = {bookId,"issued"};
            ArrayList <String> issueData=checkIssue.retrieveData(issueAttributes);
            System.out.println(issueData.get(bookIdIndex));
            if(!issueData.get(bookIdIndex).equalsIgnoreCase(bookId)){
                
                return false;
            }
            checkIssue.addBookId(Integer.parseInt(issueData.get(bookIdIndex)));
            checkIssue.addStatus(issueData.get(issueStatusIndex));
            checkIssue.addStudentId(Integer.parseInt(issueData.get(studentIdIndex)));
            if(checkIssue.getBookId()==Integer.parseInt(bookId)){
                return true;
            }
            else{
                return false;
            }
     
            
        }
        public static ArrayList<String[]> issuesTable(){
            Issue data=new Issue();
            ArrayList<String[]> issuesData=data.getIssuesTable();
            return issuesData;
        }
        public static boolean isEmptyTable(){
    ArrayList<String[]> issuesData=issuesTable();
    if(issuesData.size()==0){
        return true;
    }
    else{
        return false;
    }
}
}
