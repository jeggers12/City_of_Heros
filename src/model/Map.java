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
public class Map implements Serializable {

    public static final int NUM_ROWS = 9;
    public static final int NUM_COLS = 9;
    private Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    /////////////////////////////////////////////
    // METHODS
    /////////////////////////////////////////////
    public String toString() {
        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                if (matrix[row][col] == null) {
                    rtn += "x  ";
                }
                if (matrix[row][col].hasItem() && matrix[row][col].hasthug()) {
                    rtn += "T ";
                } else if (matrix[row][col].hasItem()) {
                    rtn += "i  ";
                } else if (matrix[row][col].hasthug()) {
                    rtn += "H  ";
                } else {
                    rtn += "X  ";
                }
            }
            rtn += "\n";
        }

        return rtn;
    }

    public Location getStartingLocation() {
        return matrix[0][0];
    }

    public void initialize() {
        int numThug = 40;
        int numItems = 20;

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location move = new Location();
                move.setCol(col);
                move.setRow(row);

                if (Math.random() > 0.5 && numThug > 0) {
                    Thug a = new Thug();
                    a.setDamage((int) (Math.random() * Thug.Max_Thug_Damage));
                    a.setHitPoints((int) (Math.random() * Thug.Max_Thug_hitPoints));
                    move.setThug(a);
                    numThug--;
                }

                if (Math.random() > 0.8 && numItems > 0) {
                    @SuppressWarnings("UnusedAssignment")
                    Item i = null;
                    if (Math.random() > 0.5) {
                        i = new Item("Health");
                    } else {
                        i = new Item("Glove");
                    }
                    i.sethitPoints(Item.Max_Damage);
                    move.setItem(i);
                    numItems--;
                }
                matrix[row][col] = move;
            }
        }

    }

}
