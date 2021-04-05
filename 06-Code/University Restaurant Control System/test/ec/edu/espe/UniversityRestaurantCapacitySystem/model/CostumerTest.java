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
        Person instance = new CostumerImpl();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Costumer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new CostumerImpl();
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, " ");
        if (result==expResult){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getName method, of class Costumer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new CostumerImpl();
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, result);
        if (result==expResult){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setName method, of class Costumer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new CostumerImpl();
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
        Person instance = new CostumerImpl();
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, instance.getMail());
       if (result==expResult){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setMail method, of class Costumer.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Person instance = new CostumerImpl();
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
        Person instance = new CostumerImpl();
        String expResult = "";
        String result = expResult;
        assertEquals(expResult, expResult);
        if (result==expResult){
            System.out.println("TEST EXECUTED");
        }else{
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setId method, of class Costumer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Person instance = new CostumerImpl();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CostumerImpl extends Person {

        public void addNewCostumer() {
        }
    }
    
}
