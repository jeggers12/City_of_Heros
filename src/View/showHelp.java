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
        System.out.println("**************************");
        System.out.println("Welcome to the Help Menu");
        System.out.println("**************************");
        System.out.println("How to play game:");
        System.out.println("W - Forward");
        System.out.println("A - Left");
        System.out.println("D - Right");
        System.out.println("S - Backwards");
        System.out.println("******************************************************");
        System.out.println("Goal:");
        System.out.println("Fight through the thugs and villans to reach the end");
        System.out.println("Watch out for the villian they will be more powerful");
        System.out.println("then the thugs");
        System.out.println("******************************************************");
        
        MainMenu mainView = new MainMenu();
        
        char in = mainView.getInput();
        
    }
    
    
    
    
    
}
