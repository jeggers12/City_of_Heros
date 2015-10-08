/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperHeros;

/**
 *
 * @author Josch
 */
public class Iceman {
    
    private int hitPoints;
    private int damage;

    public Iceman() {
    }
    

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void applydamage(int damage){
        this.hitPoints -= damage;
    }
    
}
