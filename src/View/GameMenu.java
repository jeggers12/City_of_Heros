/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control_Layer.MovementController;
import Exceptions.MapControlException;
import model.Game;
import model.Item;
import model.Location;
import model.Map;
import model.Player;
import cityofheros.CityofHeros;
import Control_Layer.Battle_Royale;
import model.Thug;

/**
 *
 * @author Josch
 */
public class GameMenu extends View {

    public GameMenu() {
        super("Please select an option:\n"
                + "W - Up\n"
                + "S - Down\n"
                + "A - Leftt\n"
                + "D - Right\n"
                + "F - Fight Thug\n"
                + "V - View Map\n"
                + "L - View current location\n"
                + "M - Main Menu");
    }

    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'W':
                moveForward();
                break;
            case 'A':
                moveLeft();
                break;
            case 'D':
                moveRight();
                break;
            case 'S':
                moveBackwards();
                break;
               // case 'F':
                //Battle();
                //break;
            case 'V':
                viewMap();
                break;
            case 'L':
                viewCurrentLocation();
                break;
            case 'P':
                pickUpItem();
                break;
            case 'M':
                return false;
            default:
                CityofHeros.output.println("Please select a valid input.");
                break;

        }
        return true;

    }

    private void moveForward() {
        MovementController l = new MovementController();
        
        Map m = Game.getInstance().getMap();
        Player p = Game.getInstance().getPlayer();
        
        boolean moved = l.movePlayerNorth(m, p);
        
        if(!moved) {
            CityofHeros.output.println("You cannot move that direction right now");
        }
    }

    private void moveLeft() {
        MovementController l = new MovementController();
        
        Map m = Game.getInstance().getMap();
        Player p = Game.getInstance().getPlayer();
        
        boolean moved = l.movePlayerWest(m, p);
        
        if(!moved) {
            CityofHeros.output.println("You cannot move that direction right now");
        }
    }

    private void moveRight() {
        MovementController l = new MovementController();
        
        Map m = Game.getInstance().getMap();
        Player p = Game.getInstance().getPlayer();
        
        boolean moved = l.movePlayerEast(m, p);
        
        if(!moved) {
            CityofHeros.output.println("You cannot move that direction right now");
        }
    }

    private void moveBackwards() {
        MovementController l = new MovementController();
        
        Map m = Game.getInstance().getMap();
        Player p = Game.getInstance().getPlayer();
        
        boolean moved = l.movePlayerSouth(m, p);
        
        if(!moved) {
            CityofHeros.output.println("You cannot move that direction right now");
        }
    }

    private void viewCurrentLocation() {
        Player p = Game.getInstance().getPlayer();
        
        CityofHeros.output.println("You are at (" + p.getLocation().getRow() + ", " + p.getLocation().getCol() + ")");
        if(p.getLocation().hasItem()) {
            CityofHeros.output.println("Items here: " + p.getLocation().getItem().getName());
        }
        
        if(p.getLocation().hasthug()) {
            CityofHeros.output.println("Thugs are here");
        }
    }

    private void viewMap() {
        CityofHeros.output.println(Game.getInstance().getMap().toString());
    }

    private void pickUpItem() {
        Player p = Game.getInstance().getPlayer();
        Location l = p.getLocation();
        
        MovementController mc = new MovementController();
        
        Item itemPickedUp = mc.pickUpItem(p);
        
        if(itemPickedUp != null) {
            CityofHeros.output.println("You picked up the " + itemPickedUp.getName());
        } else {
            CityofHeros.output.println("There is nothing here to pick up");
        }
    }

  ///  private void Battle() {
       
     //   Player p = Game.getInstance().getPlayer();
       // Location l = p.getLocation();
        
         //MovementController b = new MovementController();
         
        // Thug beginBattle = b.beginBattle(p, l);
         
        
    //}
}
