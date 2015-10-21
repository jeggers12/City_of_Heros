/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Josch
 */
public class Location implements Serializable {
    
    
    private Thug thug;
    private Item item;
    private int row;
    private int col;
    private boolean exitLocation;

    public Location() {
    }

    public Thug getThug() {
        return thug;
    }

    public void setThug(Thug thug) {
        this.thug = thug;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isExitLocation() {
        return exitLocation;
    }

    public void setExitLocation(boolean exitLocation) {
        this.exitLocation = exitLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.thug);
        hash = 97 * hash + Objects.hashCode(this.item);
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.col;
        hash = 97 * hash + (this.exitLocation ? 1 : 0);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.thug, other.thug)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.exitLocation != other.exitLocation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "thug=" + thug + ", item=" + item + ", row=" + row + ", col=" + col + ", exitLocation=" + exitLocation + '}';
    }
    
    

    
    
    /////////////////////////
    //METHODS
    /////////////////////////
    
    public boolean hasthug() {
        
        return thug != null;
    }
    
    public boolean hasItem() {
        
        return item != null;
    }

    

    
    }
    
    

