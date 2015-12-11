/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import model.Game;
import model.Map;
import model.Player;

/**
 *
 * @author Daniel
 */
public class GameController {
    
    public static Game initGame() {
        
        Game.setInstance(null);
        Game g = Game.getInstance();
        
        Player p = new Player();
        
        g.setPlayer(p);
        
        Map m = new Map();
        m.initialize();
        
        g.setMap(m);
        
        p.setLocation(m.getStartingLocation());
        
        return g;
    }
    
}
