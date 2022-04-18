/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Student;

/**
 *
 * @author ezz
 */
public class studentControl {

    public static boolean addStudent(int id,String name,String email,String department)
    {
    Student addedStudent=new Student();
    addedStudent.addName(name);
    addedStudent.addId(id);
    addedStudent.addEmail(email);
    addedStudent.addDepartment(department);
    addedStudent.saveData();
    return true;
    }
    
}
