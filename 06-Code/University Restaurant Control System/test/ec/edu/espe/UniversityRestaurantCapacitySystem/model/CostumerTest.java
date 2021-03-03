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
public class CostumerTest {
    
    public CostumerTest() {
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
     * Test of addNewCostumer method, of class Costumer.
     */
    @Test
    public void testAddNewCostumer() {
        System.out.println("addNewCostumer");
        Costumer instance = new Costumer();
        Costumer expResult = null;
        Costumer result = instance.addNewCostumer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Costumer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Costumer instance = new Costumer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Costumer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Costumer instance = new Costumer();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Costumer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Costumer instance = new Costumer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail method, of class Costumer.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Costumer instance = new Costumer();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class Costumer.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Costumer instance = new Costumer();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Costumer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Costumer instance = new Costumer();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Costumer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Costumer instance = new Costumer();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
