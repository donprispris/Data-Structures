/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UsX
 */
public class restaTest {
    
    public restaTest() {
    }

    /**
     * Test of getResta method, of class resta.
     */
    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 1.0;
        double b = 1.0;
        resta instance = new resta();
        double expResult = 0.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSuma method, of class resta.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 1.0;
        double b = 1.0;
        resta instance = new resta();
        double expResult = 2.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
