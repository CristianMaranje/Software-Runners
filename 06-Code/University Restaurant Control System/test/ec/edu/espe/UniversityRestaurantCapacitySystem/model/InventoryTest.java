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
public class InventoryTest {
    
    public InventoryTest() {
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
     * Test of toString method, of class Inventory.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Inventory instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        if (expResult == ""){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("TEST EXECUTED");}
    
    }

    /**
     * Test of getProductId method, of class Inventory.
     */
    @Test
    public void testGetProductId() {
        System.out.println("getProductId");
        Inventory instance = null;
        String expResult = "";
        String result = instance.getProductId();
        assertEquals(expResult, result);
       if (expResult == ""){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("TEST EXECUTED");}
    }

    /**
     * Test of setProductId method, of class Inventory.
     */
    @Test
    public void testSetProductId() {
        System.out.println("setProductId");
        String productId = "";
        Inventory instance = null;
        instance.setProductId(productId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct method, of class Inventory.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        Inventory instance = null;
        Product expResult = null;
        Product result = instance.getProduct();
        assertEquals(expResult, result);
        if (expResult == null){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("TEST EXECUTED");}
    }

    /**
     * Test of setProduct method, of class Inventory.
     */
    @Test
    public void testSetProduct() {
        System.out.println("setProduct");
        Product product = null;
        Inventory instance = null;
        if (instance == null){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("TEST EXECUTED");}
    }
    
}
