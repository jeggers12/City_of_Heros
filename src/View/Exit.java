/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import cityofheros.CityofHeros;

/**
 *
 * @author Josch
 */
public class Exit extends View{
    
    public Exit() {
        
        super("Are you sure you want to leave the game\n"
                + "Y- Yes\n"
                + "N- No\n");
        
    }
    
  

    
    public boolean doAction(char input) {
        
        switch(input) {
            case 'Y' :
                yes();
                break;
                case'N' :
                    return false;
                    
    
        }
        return true;
    
}

    private void yes() {
        
        CityofHeros.output.println("Come back soon hero there is much work to do");
       System.exit(0);
        
    }

    private void no() {
        MainMenu mainView = new MainMenu();
        mainView.getInput();
        
    }
}
