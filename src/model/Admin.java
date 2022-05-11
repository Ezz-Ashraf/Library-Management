/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import libraryManagement.view.home;
import libraryManagement.view.login;

/**
 *
 * @author ezz
 */
public class Admin extends User {
     
    
    @Override
    public void startPage()
    {
      
    new home().setVisible(true);
    }
}
