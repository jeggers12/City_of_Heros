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
public class Item implements Serializable {

    public static final int Max_Damage = 10;

    private String name;
    private WeaponType weaponType;
    private int hitPoints;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
        if (WeaponType.getEnumByName(name) != null) {
            this.weaponType = WeaponType.valueOf(name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gethitPoints() {
        return hitPoints;
    }

    public void sethitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isHealth() {
        if (this instanceof health) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWeapon() {
        return this instanceof Glove;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.hitPoints;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", hitPoints=" + hitPoints + '}';
    }

}
