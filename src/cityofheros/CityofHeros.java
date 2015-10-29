/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofheros;

import View.WelcomeView;
import model.Map;
import model.Player;
import View.MainMenu;

/**
 *
 * @author Josch
 */
public class CityofHeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player player = new Player();
        
      WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
     player.setName(welcomeView.getPlayerName());
      
     welcomeView.displayPlayerNameBanner(player);
        
        MainMenu mainView = new MainMenu();
        
       char in = mainView.getInput();
        
        System.out.println("YOU ENTERED " + in);
        
        char opt = mainView.doAction(input);
        System.out.println(+ opt);
        
       Map map = new Map();
      map.initialize();
        
       System.out.println(map.toString());
    }
    
}
