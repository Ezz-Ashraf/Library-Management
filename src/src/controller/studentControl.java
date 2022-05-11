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

    public static boolean addStudent(int id,String name,String email,String department , String phoneNumber , String address)
    {
    Student addedStudent=new Student.studentBuilder(name,id,email,department).addAddress(address).addPhoneNumber(phoneNumber).build();
    addedStudent.saveData();
    return true;
    }
    
}
