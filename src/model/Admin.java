/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import libraryManagement.view.adminHome;
import libraryManagement.view.login;

/**
 *
 * @author ezz
 */
public class Admin extends User {
     
    
    @Override
    public void startPage()
    {
      
    new adminHome().setVisible(true);
    }


 



}
