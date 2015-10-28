/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author Josch
 */
public class WelcomeView {
    
    public WelcomeView() {
        
    }
    
    public void displayBanner() {
        
        System.out.println("*************************************");
        System.out.println("Welcome hero your city is under attack by thugs");
        System.out.println("You as a hero must clean up this filfy town");
        System.out.println("As you go through the game you will find heros to help you");
        System.out.println("However every hero need a villan");
        System.out.println("I wish you the best of luck and your city thanks you hero");
        System.out.println("**************************************");
    
    }
    
    public String getPlayerName() {
        
        Scanner in = new Scanner(System.in);
        String name  = "";
        
        while(name.length() < 2) {
           System.out.println("Please enter your name hero:");
             name = in.nextLine();
         
             if (name.length() < 2) {
                 
                 System.out.println("Please enter naem with at least 2 characters");
             }
             
        }
        return name;
    }
    
    public void displayPlayerNameBanner(Player p) {
        
        System.out.println("*****************************");
        System.out.println("Welcome Hero " + p.getName() + "!");
        System.out.println("Please Help our City");
        System.out.println("******************************");
    
    }
    
    
    
}
