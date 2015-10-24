/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Josch
 */
public class Thug {
    
    public static final int Max_Thug_Damage = 9;
    public static final int Max_Thug_hitPoints = 29;
    
    private int hitPoints;
    private int damage;

    public Thug() {
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

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.hitPoints;
        hash = 37 * hash + this.damage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thug other = (Thug) obj;
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Thugs{" + "hitPoints=" + hitPoints + ", damage=" + damage + '}';
    }

    public void sethitPoints() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
