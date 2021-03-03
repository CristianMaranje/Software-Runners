/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import java.util.ArrayList;
import java.util.List;
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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of registerNewOrder method, of class Administrator.
     */
    @Test
    public void testRegisterNewOrder() {
        System.out.println("registerNewOrder");
        List<Order> orders = null;
        Administrator instance = new Administrator();
        instance.registerNewOrder(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class Administrator.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String username = "";
        String pass = "";
        Administrator instance = new Administrator();
        boolean expResult = false;
        boolean result = instance.validate(username, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Administrator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administrator instance = new Administrator();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Administrator.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Administrator instance = new Administrator();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Administrator.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Administrator instance = new Administrator();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCashierOrders method, of class Administrator.
     */
    @Test
    public void testGetCashierOrders() {
        System.out.println("getCashierOrders");
        Administrator instance = new Administrator();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getCashierOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCashierOrders method, of class Administrator.
     */
    @Test
    public void testSetCashierOrders() {
        System.out.println("setCashierOrders");
        ArrayList<Order> cashierOrders = null;
        Administrator instance = new Administrator();
        instance.setCashierOrders(cashierOrders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
