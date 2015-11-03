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
    
    public Exit() {
        
    }
    
    public void goodbye(){
        System.out.println("Are you sure you want to leave the game");
        System.out.println("Please select Y/N: ");
    }

    public char nomore() {
        
        Scanner in = new Scanner(System.in);
    char rtn = 0;
    String opt = "";
    
    
    while(opt.length() < 1) {
            goodbye();
            opt = in.nextLine();
            
            if(opt.length() < 1) {
                System.out.println("Please select Y/N");
                goodbye();
            } else {
            
            rtn = opt.toUpperCase().charAt(0);
    
    if(rtn != 'Y' && rtn != 'N') {
                System.out.println("Please select a valid input");
                opt = "";
    }
          
         if (rtn == 'Y') {
                    yes();
                    
                }
                
                if (rtn == 'N') {
                    
                    no();
                }
                
    }
            }
    
            return rtn;
        
    }
    
    

    
    public void doAction(char opt) {
        
        switch(opt) {
            case 'Y' :
                yes();
                break;
                case'N' :
                    no();
                    break;
    
        }
    
}

    private void yes() {
        
        System.out.println("Come back soon hero there is much work to do");
        
    }

    private void no() {
        MainMenu mainView = new MainMenu();
        mainView.getInput();
        
    }
}
