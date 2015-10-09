/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KyleSchmitt
 */
public class lex_Luther {
    
    public static final int Max_lex_Luther_Damage = 18;
    public static final int Max_lex_Luther_hitPoints = 45;
    
    private int hitPoints;
    private int damage;

    public lex_Luther() {
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

    void sethitPoints(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
