/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import View.showHelp;
import View.NewGame;

/**
 *
 * @author Josch
 */
public class MainMenu {
  
    
    public MainMenu() { 
        
        
        
    }
    
    public void displayMenu() {
        
        System.out.println("Please select one of these options");
        System.out.println("N - New Game");
        System.out.println("L - Load Game");
        System.out.println("H - Help Menu");
        System.out.println("E - Exit Game");
        
        
    }
    
    public char getInput(){
    showHelp Help = new showHelp();
      NewGame Game = new View.NewGame();
        Scanner in = new Scanner(System.in);
        String input = "";
        char rtn =0;
        
        while(input.length() < 1) {
            displayMenu();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("Please select an option");
                displayMenu();
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if(rtn != 'N' && rtn != 'L' && rtn != 'H' && rtn != 'E') {
                System.out.println("Please select a valid input");
                input = "";
            }
            if(rtn == 'H') {
                Help.helpMenu();
            }
            if(rtn == 'L' ) {
                LoadGame();
            }
            if(rtn == 'N') {
                  Game.NewGame();
            }
            if(rtn == 'E') {
                exitGame();
            }
        }
       
        }
         return rtn;
    }
        
      
    public void doAction(char input) {
        
        switch(input) {
            case 'N' :
                startNewGame();
                break;
                case'L' :
                    LoadGame();
                    break;
                case'H' :
                    showHelp();
                    break;
                case 'E' :
                    exitGame();
                    break;
                default:
                    System.out.println("ERROR ON INPUT");
        }
        
    }

    private void startNewGame() {
        
    }

    private void LoadGame() {
        System.out.println("Under Construction");
        
    }

    private void showHelp() {
        
    }

    private void exitGame() {
        System.out.println("Under Construction");
        
    }

   
        
    }
    
    

