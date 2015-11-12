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
public class NewGame extends View {

    public NewGame() {
        super("Please select an option:\n"
                + "W - Forward\n"
                + "A - Leftt\n"
                + "D - Right\n"
                + "S - Backwards\n"
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
            case 'M':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        
    }
        return true;
    
    }
    
     
    


    private void moveForward() {
        System.out.println("Under Construction");
    }

    private void moveLeft() {
        System.out.println("Under Construction");
    }

    private void moveRight() {
        System.out.println("Under Construction");
    }

    private void moveBackwards() {
       System.out.println("Under Construction");
    }
}
