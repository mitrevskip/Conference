/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario HP
 */
public class RolesTest {
    
    public RolesTest() {
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
     * Test of getRolesId method, of class Roles.
     */
    @Test
    public void testGetRolesId() {
        System.out.println("getRolesId");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.getRolesId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolesId method, of class Roles.
     */
    @Test
    public void testSetRolesId() {
        System.out.println("setRolesId");
        int rolesId = 0;
        Roles instance = new Roles();
        instance.setRolesId(rolesId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Roles.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Roles.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        int category = 0;
        Roles instance = new Roles();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Roles.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Roles.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Roles instance = new Roles();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
