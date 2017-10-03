/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Roles;
import java.util.List;
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
public class IRolesDAOTest {
    
    public IRolesDAOTest() {
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
     * Test of getAllRoles method, of class IRolesDAO.
     */
    @Test
    public void testGetAllRoles() {
        System.out.println("getAllRoles");
        IRolesDAO instance = new IRolesDAOImpl();
        List<Roles> expResult = null;
        List<Roles> result = instance.getAllRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolesById method, of class IRolesDAO.
     */
    @Test
    public void testGetRolesById() {
        System.out.println("getRolesById");
        int rolesId = 0;
        IRolesDAO instance = new IRolesDAOImpl();
        Roles expResult = null;
        Roles result = instance.getRolesById(rolesId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRoles method, of class IRolesDAO.
     */
    @Test
    public void testUpdateRoles() {
        System.out.println("updateRoles");
        Roles roles = null;
        IRolesDAO instance = new IRolesDAOImpl();
        instance.updateRoles(roles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRoles method, of class IRolesDAO.
     */
    @Test
    public void testDeleteRoles() {
        System.out.println("deleteRoles");
        int rolesId = 0;
        IRolesDAO instance = new IRolesDAOImpl();
        instance.deleteRoles(rolesId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoles method, of class IRolesDAO.
     */
    @Test
    public void testAddRoles() {
        System.out.println("addRoles");
        Roles roles = null;
        IRolesDAO instance = new IRolesDAOImpl();
        instance.addRoles(roles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rolesExists method, of class IRolesDAO.
     */
    @Test
    public void testRolesExists() {
        System.out.println("rolesExists");
        int rolesId = 0;
        int category = 0;
        IRolesDAO instance = new IRolesDAOImpl();
        boolean expResult = false;
        boolean result = instance.rolesExists(rolesId, category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IRolesDAOImpl implements IRolesDAO {

        public List<Roles> getAllRoles() {
            return null;
        }

        public Roles getRolesById(int rolesId) {
            return null;
        }

        public void updateRoles(Roles roles) {
        }

        public void deleteRoles(int rolesId) {
        }

        public void addRoles(Roles roles) {
        }

        public boolean rolesExists(int rolesId, int category) {
            return false;
        }
    }
    
}
