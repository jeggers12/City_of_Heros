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
public class Glove extends Item implements Serializable {
    
    String name;
    int hitPoints;
    public Glove() {
        super();
    }

    @Override
    public String getName() {
        
        return name;
        
        
    }

    @Override
    public void setName(String name) {
        
        this.name = name;
        
    }

    @Override
    public int gethitPoints() {
        
        return hitPoints;
        
        
    }

    public void sethitPoints() {
        
        this.hitPoints = hitPoints;
        
        
    }
    
}
