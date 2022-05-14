/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author omark
 */
public interface dataProcessing {
      public void saveData();
      public ArrayList<String> retrieveData(String ...condition);
}
