/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public enum WeaponType {

        WHIP("Whip"),
        BATARANG("Batarang"),
        GLOVE("Glove"),;

        private final String name;

        WeaponType(String fn) {
            this.name = fn;
        }

        public static WeaponType getEnumByName(String name) {
            try {
                return WeaponType.valueOf(name);
            } catch (Exception e) {
                //Bury this we don't care
            }
            return null;
        }
        
        public String getName() {
            return this.name;
        }

    }
