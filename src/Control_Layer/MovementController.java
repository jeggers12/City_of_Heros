/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import model.Location;
import model.Map;
import model.Player;

        
/**
 *
 * @param col column
 * @param row row
 * @author KyleSchmitt
 */
public class MovementController {
    
    public boolean movePlayerNorth(Map m, Player p){
        
       Location currentLocation = p.getLocation();                
       
       if(currentLocation.getRow() == 0) {            
           return false;        
       }                
       
       Location newLocation = m.getMatrix()[currentLocation.getRow() - 1][currentLocation.getCol()];  
       
       p.setLocation(newLocation);
       
       return true;

        //[0,0][0,1][0,2][0,3]        
        //[1,0][1,1][1,2][1,3]
    }
    
    public boolean pickUpItem(Player p){
        
        Location currentLocation = p.getLocation();
        
        if(currentLocation.getItem() == null){
            return false;
        }
        else{
           currentLocation.getItem()
        }
        
    }
    
    public void beginBattle(){
        
    }
    
}
