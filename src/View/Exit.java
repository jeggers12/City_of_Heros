/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Josch
 */
public class Exit {
    
    public Exit(){
        
    }

    public char Exit() {
        
        Scanner in = new Scanner(System.in);
        String opt = "";
        char rtn = 0;
         MainMenu mainView = new MainMenu();
        
        System.out.println("Are you sure you want to leave the game");
          opt = in.nextLine();
         opt = "";
         if(rtn == 'Y') {
        
        System.out.println("Come back soon hero there is much work to do");
             
        } 
         if(rtn == 'N') {
             mainView.getInput();
             
         }
       
         return rtn;
        
    }
    
    
    
}
