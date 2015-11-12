/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



/**
 *
 * @author Josch
 */
public class MainMenu extends View {
  
    
    public MainMenu() { 
       
        super ("Please Select an option:\n" 
              + "N - New Game\n" 
              + "L - Load Game\n"
              + "H - Help Menu\n"
              + "E - Exit Game\n");
           }
     
    @Override
    public boolean doAction(char input) {
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
                    return false;
                    
                
                default:
                    System.out.println("ERROR ON INPUT");
                    break;
        }
        
        return true;
        
    }

    private void startNewGame() {
        NewGame g = new NewGame();
        g.display();
        
    }

    private void LoadGame() {
        System.out.println("Under Construction");
        
    }

    private void showHelp() {
        showHelp h = new showHelp();
        h.display();
        
    }

    
   
        
    }
    
    

