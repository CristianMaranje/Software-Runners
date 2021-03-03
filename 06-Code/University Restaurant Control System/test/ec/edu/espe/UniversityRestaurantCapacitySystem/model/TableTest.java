/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

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
public class TableTest {
    
    public TableTest() {
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
     * Test of toString method, of class Table.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Table instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAviable method, of class Table.
     */
    @Test
    public void testIsAviable() {
        System.out.println("isAviable");
        Table instance = null;
        boolean expResult = false;
        boolean result = instance.isAviable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAviable method, of class Table.
     */
    @Test
    public void testSetAviable() {
        System.out.println("setAviable");
        boolean aviable = false;
        Table instance = null;
        instance.setAviable(aviable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableId method, of class Table.
     */
    @Test
    public void testGetTableId() {
        System.out.println("getTableId");
        Table instance = null;
        int expResult = 0;
        int result = instance.getTableId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTableId method, of class Table.
     */
    @Test
    public void testSetTableId() {
        System.out.println("setTableId");
        int tableId = 0;
        Table instance = null;
        instance.setTableId(tableId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Table.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Table instance = null;
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Table.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Table instance = null;
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
