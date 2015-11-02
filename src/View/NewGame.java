/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.Map;

/**
 *
 * @author Josch
 */
public class NewGame {

   public NewGame(){
       
   }
    
    public void NewGame() {
        
        Map map = new Map();
     map.initialize();
        
     System.out.println(map.toString());
    }

    
    
    
    
     
    
}
