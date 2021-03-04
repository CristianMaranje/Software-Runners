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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of addNewCostumer method, of class Student.
     */
    @Test
    public void testAddNewCostumer() {
        System.out.println("addNewCostumer");
        Student instance = new Student();
        instance.addNewCostumer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisscount method, of class Student.
     */
    @Test
    public void testGetDisscount_Product() {
        System.out.println("getDisscount");
        Product product = null;
        Student instance = new Student();
        instance.getDisscount(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisscount method, of class Student.
     */
    @Test
    public void testGetDisscount_0args() {
        System.out.println("getDisscount");
        Student instance = new Student();
        float expResult = 0.0F;
        float result = instance.getDisscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisscount method, of class Student.
     */
    @Test
    public void testSetDisscount() {
        System.out.println("setDisscount");
        float disscount = 0.0F;
        Student instance = new Student();
        instance.setDisscount(disscount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
