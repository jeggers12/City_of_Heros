/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import model.Player;
import model.Thug;
import cityofheros.CityofHeros;

/**
 * @param p The Player
 * @param a The Thug
 * @return true if the thug is defeated, false if not defeated
 * @author Josch
 */
public class Battle_Royale {

    public Battle_Royale() {
        CityofHeros.output.println("Please select one of these options:\n"
                + "A - Attack\n"
                + "R - Run\n");
    }
    
    
    public boolean attackThug(Player p, Thug a) {
        
        int playerDamage = (int)(Player.Max_Damage * Math.random()) + 1;
        
        a.setHitPoints(a.getHitPoints() - playerDamage);
        
        if(a.getHitPoints() <= 0) {
            return true;
            
        } else {
        return false;
        
        }
    }
        
        public boolean attackPlayer(Player p, Thug a) {
        
        int thugDamage = (int)(Thug.Max_Thug_Damage * Math.random()) + 1;
     
        
       p.applyDamage(thugDamage);
        
        if(p.getHitPoints()<= 0) {
            return true;
            
        } else {
        return false;
        
        }
        
        
    }

    
}

