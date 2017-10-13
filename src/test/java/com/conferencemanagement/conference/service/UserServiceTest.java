/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.User;
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
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of getAllUsers method, of class UserService.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserService.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int userId = 0;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.getUserById(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        UserService instance = new UserService();
        boolean expResult = false;
        boolean result = instance.addUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserService.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserService instance = new UserService();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserService.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int userId = 0;
        UserService instance = new UserService();
        instance.deleteUser(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
