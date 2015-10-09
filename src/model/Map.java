/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Items.Gloves;
import java.io.Serializable;

/**
 *
 * @author Josch
 */
public class Map implements Serializable {
    
    private int numRows;
    private int numCols;
    private Location[] [] matrix;

    public Map() {
    }

    
    
    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }
    
    
    ////////////////////////
    // Methods
    ///////////////////////
    
    public void initialize() {
        numRows = 9;
        numCols = 9;
        
        int numThugs = 30;
        int numItems = 15;
        
        
        for(int row = 0; row < numRows; row++) {
            for(int col = 0; col < numCols; col++){
                Location move = new Location();
                move.setCol(col);
                move.setRow(row);
                
                
                if (Math.random() > 0.5 && numThugs > 0) {
                    Thugs a = new Thugs();
                    a.setDamage((int)(Math.random() * Thugs.Max_Thugs_Damage) +1);
                    a.sethitPoints((int)(Math.random() * Thugs.Max_Thugs_hitPoints) +1);
                    move.setThugs(a);
                    numThugs--;
                }
                
                if(Math.random() > .7 && numItems > 0) {
                    Item i = null;
                    if(Math.random() > 0.7) {
                        i = new Item();
                        i.setName("Strenghth");
                        
                    } else {
                        
                        i = new health();
                        i.setName("Health");
                    }
                }
                
        }
    }
    
    
    
}
}

