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
public class Batring implements Serializable {
    
    private int damage;

    public Batring() {
    }
    
    

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
}
