/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import cityofheros.CityofHeros;


/**
 *
 * @author Josch 
 */
public class Battle extends View {

    public Battle(String menuString) {
        super(menuString);
    }
    
    public Battle() {
        super("Please select an option:\n"
                + "A - Attack without Item\n"
                + "I - Attack with Item\n"
                + "R - Attempt to run\n");
    }
    
    
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'A':
                return attack();
            case 'I':
                return attackWithItem();
            
            case 'R':
                return run();
            default:
                CityofHeros.output.println("Please select a valid input.");
                break;
        }

        return true;

    }

    private boolean attack() {
        CityofHeros.output.println("Under Construtction");
        return false;
    }

    private boolean attackWithItem() {
        CityofHeros.output.println("Under Construtction");
        return false;
    }

    
    private boolean run() {
        return false;
    }
}