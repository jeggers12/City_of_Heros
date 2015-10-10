/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Josch
 */
public class wonder_Woman implements Serializable {
    
    private int hitPoints;
    private int damage;

    public wonder_Woman() {
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
    
    public void applyDamage(int damage){
    this.hitPoints -= damage;
    
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
        final wonder_Woman other = (wonder_Woman) obj;
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
        return "wonder_Woman{" + "hitPoints=" + hitPoints + ", damage=" + damage + '}';
    }
    
}
