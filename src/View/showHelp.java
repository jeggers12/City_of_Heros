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
public class showHelp extends View {

    public showHelp() {
        
        super("Please select one of these options:\n"
                + "G - Goals\n"
                + "C - Controls\n"
                + "B - How to Battle\n"
                + "M - Back to Main Menu\n");
    }
    
   public boolean doAction(char input) {
        
        switch(input) {
            case 'G' :
                Goals();
                break;
                case'C' :
                    Controls();
                    break;
                case'B' :
                    Battle();
                    break;
                case 'M' :
                    return false;
                   
                default:
                    CityofHeros.output.println("ERROR ON INPUT");
                    break;
        }
        return true;
    }

    private void Goals() {
        
       
        CityofHeros.output.println("*****************************************************************");
        CityofHeros.output.println("The goal of this game is to fight your way throught the city.");
        CityofHeros.output.println("Along the way you will find heros to help you along the way.");
        CityofHeros.output.println("However you will also find villans and thugs that will try to");
        CityofHeros.output.println("stop you from reaching the end of the city. You are our only hope");
        CityofHeros.output.println("hero now get out there and fight till the end");
        CityofHeros.output.println("*****************************************************************");
        
    }


    private void Controls() {
        CityofHeros.output.println("*****************************************************************");
        CityofHeros.output.println("W - Forward");
        CityofHeros.output.println("A - Left");
        CityofHeros.output.println("D - Right");
        CityofHeros.output.println("S - Backwards");
        CityofHeros.output.println("*****************************************************************");
    }

    private void Battle() {
        
        CityofHeros.output.println("Under construction");
       
    }

    
}
   
           
        
     
        
   
        

