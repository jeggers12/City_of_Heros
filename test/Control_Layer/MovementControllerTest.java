/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KyleSchmitt
 */
public class MovementControllerTest {
    
    public MovementControllerTest() {
    }

    /**
     * Test of movePlayerToLocation method, of class MovementController.
     */
    @Test
    public void testMovePlayerToLocation() {
        CityofHeros.output.println("movePlayerToLocation");
        int col = 0;
        int row = 0;
        MovementController instance = new MovementController();
        instance.movePlayerToLocation(col, row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpItem method, of class MovementController.
     */
    @Test
    public void testPickUpItem() {
        CityofHeros.output.println("pickUpItem");
        MovementController instance = new MovementController();
        instance.pickUpItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beginBattle method, of class MovementController.
     */
    @Test
    public void testBeginBattle() {
        CityofHeros.output.println("beginBattle");
        MovementController instance = new MovementController();
        instance.beginBattle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
