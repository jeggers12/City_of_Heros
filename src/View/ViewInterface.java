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
public interface ViewInterface {
    
    public void display();
    
    public char getInput();
    
    public boolean doAction(char input);
    
}
