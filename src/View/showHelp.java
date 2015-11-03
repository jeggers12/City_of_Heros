/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import View.MainMenu;

/**
 *
 * @author Josch
 */
public class showHelp {

    public showHelp() {
    }
    

    
    
    
    
    public void helpMenu() {
        System.out.println("*************************************");
        System.out.println("Please select one of these options:");
        System.out.println("*************************************");
        System.out.println("G - Goals");
        System.out.println("C - Controls");
        System.out.println("B - How to Battle");
        System.out.println("M - Back to Main Menu");
        System.out.println("************************");
    }
    public char opt() {
        
     Scanner in = new Scanner(System.in);
    char rtn = 0;
    String opt = "";
     MainMenu mainView = new MainMenu();
    
    while(opt.length() < 1) {
            helpMenu();
            opt = in.nextLine();
            
            if(opt.length() < 1) {
                System.out.println("Please select an option");
                helpMenu();
            } else {
            
            rtn = opt.toUpperCase().charAt(0);
    
    if(rtn != 'G' && rtn != 'C' && rtn != 'B' && rtn != 'M') {
                System.out.println("Please select a valid input");
                opt = "";
    }
                
                if(rtn == 'G') {
                    Goals();
                    
                }
                
                if(rtn == 'C') {
                    Controls();
                    
                }
                
                if (rtn == 'B') {
                    Battle();
                    
                }
                
                if (rtn == 'M') {
                    
                    mainView.getInput();
                }
                
    }
            }
    
            return rtn;
        
    }
    

   public void doAction(char opt) {
        
        switch(opt) {
            case 'G' :
                Goals();
                break;
                case'C' :
                    Controls();
                    break;
                case'B' :
                    Battle();
                    break;
                case 'M' :
                    MainMenu();
                    break;
                default:
                    System.out.println("ERROR ON INPUT");
        }
        
    }

    private void Goals() {
        
       
        System.out.println("*****************************************************************");
        System.out.println("The goal of this game is to fight your way throught the city.");
        System.out.println("Along the way you will find heros to help you along the way.");
        System.out.println("However you will also find villans and thugs that will try to");
        System.out.println("stop you from reaching the end of the city. You are our only hope");
        System.out.println("hero now get out there and fight till the end");
        System.out.println("*****************************************************************");
        
    }


    private void Controls() {
        System.out.println("*****************************************************************");
        System.out.println("W - Forward");
        System.out.println("A - Left");
        System.out.println("D - Right");
        System.out.println("S - Backwards");
        System.out.println("*****************************************************************");
    }

    private void Battle() {
        
        System.out.println("Under construction");
       
    }

    private void MainMenu() {
        
    }
}
   
           
        
     
        
   
        

