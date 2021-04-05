/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UniversityRestaurantCapacitySystem.model;

import com.mongodb.BasicDBList;
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
public class OrderTest {

    public OrderTest() {
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
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = new Order();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToOrder method, of class Order.
     */
    @Test
    public void testAddNewProduct() {
        System.out.println("addNewProduct");
        Order instance = new Order();
        BasicDBList expResult = null;
        
        assertEquals(expResult,"");
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getDate method, of class Order.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, null);
        if (result == expResult) {
            System.out.println("TEST EXECUTED");
        } else {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testDate() {
        System.out.println("getDate");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, null);
        if (result == expResult) {
            System.out.println("TEST EXECUTED");
        }
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetDateNull() {
        System.out.println("getDate");
        Order instance = new Order();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, 0);
        if (result == expResult) {
            System.out.println("TEST EXECUTED");
        } else {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDate method, of class Order.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Order instance = new Order();
        instance.setDate(date);
        if (date == null) {
            System.out.println("TEST EXECUTED");
        } else {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getCostumer method, of class Order.
     */
    @Test
    public void testGetCostumer() {
        System.out.println("getCostumer");
        Order instance = new Order();
        Person expResult = null;
        Person result = instance.getCostumer();
        assertEquals(expResult, result);
        if (expResult == null) {
            System.out.println("TEST EXECUTED");
        } else {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCostumer method, of class Order.
     */
    @Test
    public void testSetCostumer() {
        System.out.println("setCostumer");
        Person costumer = null;
        Order instance = new Order();
        instance.setCostumer(costumer);
        if (instance == null) {
            System.out.println("TEST EXECUTED");
        }
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testSetCostumerStudent() {
        System.out.println("setCostumer");
        Person costumer = null;
        Order instance = new Order();
        instance.setCostumer(costumer);
        if (instance == null) {
            System.out.println("TEST EXECUTED");
        }
        // TODO review the generated test code and remove the default call to fail.
        /**
         * Test of getProduct method, of class Order.
         */
    }
    
    @Test
    public void testSetCostumerEmployee() {
        System.out.println("setCostumer");
        Person costumer = null;
        Order instance = new Order();
        instance.setCostumer(costumer);
        if (instance == null) {
            System.out.println("TEST EXECUTED");
        }
        // TODO review the generated test code and remove the default call to fail.
        /**
         * Test of getProduct method, of class Order.
         */
    }   
    @Test
    public void testCostumerStudent() {
        System.out.println("setCostumer");
        Person costumer = null;
        Order instance = new Order();
        instance.setCostumer(costumer);
        if (instance == null) {
            System.out.println("TEST EXECUTED");
        }
        // TODO review the generated test code and remove the default call to fail.
        /**
         * Test of getProduct method, of class Order.
         */
    }
        @Test
        public void testGetProduct
        
            () {
        System.out.println("getProduct");
            Order instance = new Order();
            Product[] expResult = null;
            Product[] result = instance.getProduct();
            assertArrayEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }

        /**
         * Test of setProduct method, of class Order.
         */
        @Test
        public void testSetProduct
        
            () {
        System.out.println("setProduct");
            Product[] product = null;
            Order instance = new Order();
            instance.setProduct(product);
            // TODO review the generated test code and remove the default call to fail.

        }

            
        @Test
        public void testSetProduts() {
        System.out.println("setProduct");
            Product[] product = null;
            Order instance = new Order();
            instance.setProduct(product);
            // TODO review the generated test code and remove the default call to fail.

        }
    }
