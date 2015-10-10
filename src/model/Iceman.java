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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.hitPoints;
        hash = 17 * hash + this.damage;
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
        final Iceman other = (Iceman) obj;
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
        return "Iceman{" + "hitPoints=" + hitPoints + ", damage=" + damage + '}';
    }
    
    
}
