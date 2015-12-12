/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import model.Player;
import cityofheros.CityofHeros;
/**
 *
 * @author Josch
 */
public class WelcomeView {
    
    public WelcomeView() {
        
    }
    
    public void displayBanner() {
        
        CityofHeros.output.println("*************************************");
        CityofHeros.output.println("Welcome hero your city is under attack by thugs,");
        CityofHeros.output.println("you as a hero must clean up this filfy town.");
        CityofHeros.output.println("As you go through the game you will find heros");
        CityofHeros.output.println("to help you. However every hero need a villan");
        CityofHeros.output.println("I wish you the best of luck and your city");
        CityofHeros.output.println("thanks you hero.");
        CityofHeros.output.println("**************************************");
    
    }
    
    public String getPlayerName() {
        
        Scanner in = new Scanner(System.in);
        String name  = "";
        
        while(name.length() < 2) {
           CityofHeros.output.println("Please enter your name hero:");
             name = in.nextLine();
         
             if (name.length() < 2) {
                 
                 CityofHeros.output.println("Please enter naem with at least 2 characters");
             }
             
        }
        return name;
    }
    
    public void displayPlayerNameBanner(Player p) {
        
        CityofHeros.output.println("*****************************");
        CityofHeros.output.println("Welcome Hero " + p.getName() + "!");
        CityofHeros.output.println("Please Help our City");
        CityofHeros.output.println("******************************");
    
    }
    
    
    
}
