/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Game {
    
    private Player player;
    private Map map;
    
    private static Game instance;
    
    private Game() {
        
    }
    
    public static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }
    
    public static void setInstance(Game g) {
        instance = g;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    
}
