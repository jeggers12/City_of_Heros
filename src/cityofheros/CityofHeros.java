/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofheros;

import View.Exit;
import View.WelcomeView;
import model.Map;
import model.Player;
import View.MainMenu;
import View.showHelp;


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
        mainView.display();
        
     // char in = mainView.getInput();
       
      // System.out.println("YOU ENTERED " + in);
       
      // showHelp Help = new showHelp();
       
      //* if(in == 'H'){
           
       
   //      char opt = Help.opt();
       
     //  System.out.println("YOU ENTERED " + opt);
       
       //if(opt == 'G'|| opt == 'C' || opt == 'B'){
          
        //Help.opt();
       //}
       
        //Exit goodbye = new Exit();
      
          // if(in == 'E'){
            //   char exit = goodbye.nomore();
              // System.out.println("You Entered " + exit);
        
        //  Map map = new Map();
   //  map.initialize();
        
     //System.out.println(map.toString());
               
           
       }
               
           }
   
      
           
       
      
    
    


