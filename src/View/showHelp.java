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
    

    
    
    
    
    public void showHelp() {
        System.out.println("Please select one of these options");
        System.out.println("G - Goals");
        System.out.println("C - Controls");
        System.out.println("B - How to Battle");
        System.out.println("M - Back to Main Menu");
        
        MainMenu mainView = new MainMenu();
        
        char in = mainView.getInput();
        
    }
    
    
    
    
    
}
