/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import model.Item;
import model.Location;
import model.Map;
import model.Player;
import model.Thug;

/**
 *
 * @param p Player
 * @param m Map
 * @author KyleSchmitt
 */
public class MovementController {

    public MovementController() {
    }

    public boolean movePlayerNorth(Map m, Player p) {

        Location currentLocation = p.getLocation();

        if (currentLocation.getRow() == 0) {
            return false;
        }

        Location newLocation = m.getMatrix()[currentLocation.getRow() - 1][currentLocation.getCol()];

        p.setLocation(newLocation);

        return true;
    }

    public boolean movePlayerSouth(Map m, Player p) {

        Location currentLocation = p.getLocation();

        if (currentLocation.getRow() == m.getMatrix().length - 1) {
            return false;
        }

        Location newLocation = m.getMatrix()[currentLocation.getRow() + 1][currentLocation.getCol()];

        p.setLocation(newLocation);

        return true;
    }

    public boolean movePlayerEast(Map m, Player p) {

        Location currentLocation = p.getLocation();

        if (currentLocation.getCol() == m.getMatrix()[0].length - 1) {
            return false;
        }

        Location newLocation = m.getMatrix()[currentLocation.getRow()][currentLocation.getCol() + 1];

        p.setLocation(newLocation);

        return true;
    }

    public boolean movePlayerWest(Map m, Player p) {

        Location currentLocation = p.getLocation();

        if (currentLocation.getCol() == 0) {
            return false;
        }

        Location newLocation = m.getMatrix()[currentLocation.getRow()][currentLocation.getCol() - 1];

        p.setLocation(newLocation);

        return true;
    }

    public Item pickUpItem(Player p) {

        Location currentLocation = p.getLocation();

        if (currentLocation.getItem() == null) {
            return null;
        } else {
            Item i = currentLocation.getItem();
            p.getItems().add(i);
            currentLocation.setItem(null);

            return i;
        }

    }
    
    
    public Item pickUpItem(Player p, Location l) {
        
        if(l.hasItem()) {
            Item i = l.getItem();
            p.addItemToInventory(i);
            l.setItem(null);
            
            return i;
        } else {
            return null;
        }
    }
    

    public  Thug beginBattle(Player p, Location l) {
        
        if(l.hasthug()) {
            
            Thug t = l.getThug();
            p.applyDamage(9);
            l.setThug(null);
            
            return t;
        } else {
            return null;
        }

    }

}
