/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ariel Nicolás Hidrobo Fernández
 */
public class ReceiptTest {
    
    public ReceiptTest() {
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
     * Test of toString method, of class Receipt.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Receipt instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReciptId method, of class Receipt.
     */
    @Test
    public void testGetReciptId() {
        System.out.println("getReciptId");
        Receipt instance = null;
        int expResult = 0;
        int result = instance.getReciptId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReciptId method, of class Receipt.
     */
    @Test
    public void testSetReciptId() {
        System.out.println("setReciptId");
        int reciptId = 0;
        Receipt instance = null;
        instance.setReciptId(reciptId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Receipt.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Receipt instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Receipt.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Receipt instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCostumerName method, of class Receipt.
     */
    @Test
    public void testGetCostumerName() {
        System.out.println("getCostumerName");
        Receipt instance = null;
        String expResult = "";
        String result = instance.getCostumerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCostumerName method, of class Receipt.
     */
    @Test
    public void testSetCostumerName() {
        System.out.println("setCostumerName");
        String costumerName = "";
        Receipt instance = null;
        instance.setCostumerName(costumerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCostumerID method, of class Receipt.
     */
    @Test
    public void testGetCostumerID() {
        System.out.println("getCostumerID");
        Receipt instance = null;
        int expResult = 0;
        int result = instance.getCostumerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCostumerID method, of class Receipt.
     */
    @Test
    public void testSetCostumerID() {
        System.out.println("setCostumerID");
        int costumerID = 0;
        Receipt instance = null;
        instance.setCostumerID(costumerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayment method, of class Receipt.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Receipt instance = null;
        float expResult = 0.0F;
        float result = instance.getPayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayment method, of class Receipt.
     */
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        float payment = 0.0F;
        Receipt instance = null;
        instance.setPayment(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
