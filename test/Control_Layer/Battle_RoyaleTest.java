/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import model.Player;
import model.Thug;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josch
 */
public class Battle_RoyaleTest {
    
    public Battle_RoyaleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of attackThug method, of class Battle_Royale.
     */
    @Test
    public void testAttackThug() {
        System.out.println("attackThug");
        Player p = new Player();
        Thug a = new Thug();
        a.setHitPoints(100);
        Battle_Royale instance = new Battle_Royale();
        boolean expResult = false;
        boolean result = instance.attackThug(p, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of attackPlayer method, of class Battle_Royale.
     */
    @Test
    public void testAttackPlayer() {
        System.out.println("attackPlayer");
        Player p = new Player();
        Thug a = new Thug();
        p.setHitPoints(30);
        Battle_Royale instance = new Battle_Royale();
        boolean expResult = false;
        boolean result = instance.attackPlayer(p, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
