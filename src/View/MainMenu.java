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
                showHelp();
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
        System.out.println("Under Construction");
        
    }

    private void LoadGame() {
        System.out.println("Under Construction");
        
    }

    private void showHelp() {
                
        System.out.println("**************************");
        System.out.println("Welcome to the Help Menu");
        System.out.println("**************************");
        System.out.println("How to play game:");
        System.out.println("W - Forward");
        System.out.println("A - Left");
        System.out.println("D - Right");
        System.out.println("S - Backwards");
        System.out.println("Goal:");
        System.out.println("Fight through the thugs and villans to reach the end");
        System.out.println("Hit R to return to Menu");
     
    }

    private void exitGame() {
        System.out.println("Under Construction");
        
    }

   
        
    }
    
    

