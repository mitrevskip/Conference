/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Role;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Petar
 */
public class RoleServiceTest {
    
    public RoleServiceTest() {
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
     * Test of getAllRoles method, of class RoleService.
     */
    @Test
    public void testGetAllRoles() {
        System.out.println("getAllRoles");
        RoleService instance = new RoleService();
        List<Role> expResult = null;
        List<Role> result = instance.getAllRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleById method, of class RoleService.
     */
    @Test
    public void testGetRoleById() {
        System.out.println("getRoleById");
        int roleId = 0;
        RoleService instance = new RoleService();
        Role expResult = null;
        Role result = instance.getRoleById(roleId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRole method, of class RoleService.
     */
    @Test
    public void testAddRole() {
        System.out.println("addRole");
        Role role = null;
        RoleService instance = new RoleService();
        boolean expResult = false;
        boolean result = instance.addRole(role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRole method, of class RoleService.
     */
    @Test
    public void testUpdateRole() {
        System.out.println("updateRole");
        Role role = null;
        RoleService instance = new RoleService();
        instance.updateRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
