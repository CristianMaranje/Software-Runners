/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.view;

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
public class DisplayTest {
    
    public DisplayTest() {
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
     * Test of productToFind method, of class Display.
     */
    @Test
    public void testProductToFind() {
        System.out.println("productToFind");
        Display instance = new Display();
        int expResult = 0;
        int result = instance.productToFind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class Display.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        Display instance = new Display();
        int expResult = 0;
        int result = instance.displayMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllProducts method, of class Display.
     */
    @Test
    public void testDisplayAllProducts() {
        System.out.println("displayAllProducts");
        List<String> products = null;
        Display instance = new Display();
        instance.displayAllProducts(products);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayOfCostumer method, of class Display.
     */
    @Test
    public void testDisplayOfCostumer() {
        System.out.println("displayOfCostumer");
        List<String> costumers = null;
        Display instance = new Display();
        instance.displayOfCostumer(costumers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllOrders method, of class Display.
     */
    @Test
    public void testDisplayAllOrders() {
        System.out.println("displayAllOrders");
        List<String> orders = null;
        Display instance = new Display();
        instance.displayAllOrders(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReceipt method, of class Display.
     */
    @Test
    public void testDisplayReceipt() {
        System.out.println("displayReceipt");
        String orders = "";
        Display instance = new Display();
        instance.displayReceipt(orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
