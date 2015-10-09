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
public class Item {
    
    private int batboots;
    private int batring;
    private int cape;
    private int gloves;
    private int icearmor;
    private int iceshard;

    public Item() {
    }

    public int getBatboots() {
        return batboots;
    }

    public void setBatboots(int batboots) {
        this.batboots = batboots;
    }

    public int getBatring() {
        return batring;
    }

    public void setBatring(int batring) {
        this.batring = batring;
    }

    public int getCape() {
        return cape;
    }

    public void setCape(int cape) {
        this.cape = cape;
    }

    public int getGloves() {
        return gloves;
    }

    public void setGloves(int gloves) {
        this.gloves = gloves;
    }

    public int getIcearmor() {
        return icearmor;
    }

    public void setIcearmor(int icearmor) {
        this.icearmor = icearmor;
    }

    public int getIceshard() {
        return iceshard;
    }

    public void setIceshard(int iceshard) {
        this.iceshard = iceshard;
    }
    
    

    void setName(String strenghth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
