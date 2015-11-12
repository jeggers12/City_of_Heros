/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
                    System.out.println("ERROR ON INPUT");
                    break;
        }
        return true;
    }

    private void Goals() {
        
       
        System.out.println("*****************************************************************");
        System.out.println("The goal of this game is to fight your way throught the city.");
        System.out.println("Along the way you will find heros to help you along the way.");
        System.out.println("However you will also find villans and thugs that will try to");
        System.out.println("stop you from reaching the end of the city. You are our only hope");
        System.out.println("hero now get out there and fight till the end");
        System.out.println("*****************************************************************");
        
    }


    private void Controls() {
        System.out.println("*****************************************************************");
        System.out.println("W - Forward");
        System.out.println("A - Left");
        System.out.println("D - Right");
        System.out.println("S - Backwards");
        System.out.println("*****************************************************************");
    }

    private void Battle() {
        
        System.out.println("Under construction");
       
    }

    
}
   
           
        
     
        
   
        

