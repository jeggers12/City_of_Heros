/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Josch
 */
public class BattleException extends Exception {

    public BattleException() {
    }

    public BattleException(String string) {
        super(string);
    }

    public BattleException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public BattleException(Throwable thrwbl) {
        super(thrwbl);
    }

    public BattleException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
