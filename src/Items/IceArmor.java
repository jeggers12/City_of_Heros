/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.io.Serializable;

/**
 *
 * @author Josch
 */
public class IceArmor implements Serializable {
    
    private int defense;

    public IceArmor() {
    }
    
    

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    
}
