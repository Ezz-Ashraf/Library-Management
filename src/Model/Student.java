/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author omark
 */
public class Student {
    private String name;
    private String id;
    private String email;
    private String department;
    Student(String name,String id, String email,String department){
        this.department=department;
        this.name=name;
        this.id=id;
        this.email=email;
    }
    
    
}
