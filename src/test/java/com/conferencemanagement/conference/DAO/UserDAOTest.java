/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Role;
import com.conferencemanagement.conference.models.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Mario HP
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
public class UserDAOTest {
    @Autowired
    IUserDAO userDAO;
    
    @Autowired
    IRoleDAO roleDAO;
    
    public UserDAOTest() {
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
     * Test of getAllUsers method, of class UserDAO.
     */
//    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserDAO instance = new UserDAO();
        List<User> expResult = null;
        List<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserDAO.
     */
//    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int userId = 0;
        UserDAO instance = new UserDAO();
        User expResult = null;
        User result = instance.getUserById(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() {
        User u = new User();
        u.setUserName("petar8");
        u.setPassword("aaaaa");
        
        Role role = new Role();
        role = roleDAO.getRoleByCat(4);
         
        
        u.setRole(role);
        userDAO.addUser(u);
        
//        User u2 = new User();
//        u2.setUserName("Mario2");
//        u2.setPassword("aaaaa");
//        Role role2 = new Role();
//        role2.setCategory(3);
//        u2.setRole(role2);
//        userDAO.addUser(u2);
//        
//        User u3 = new User();
//        u3.setUserName("Mario3");
//        u3.setPassword("aaaaa");
//        Role role3 = new Role();
//        role3.setCategory(3);
//        role3.getRoleId();
//        u3.setRole(role3);
//        userDAO.addUser(u3);
//        
//        User u4 = new User();
//        u4.setUserName("Mario4");
//        u4.setPassword("aaaaa");
//        Role role4 = new Role();
//        role4.setCategory(3);
//        u4.setRole(role4);
//        userDAO.addUser(u4);
//        
        
        
        
        
     //   assertEquals(role.getRoleId(), u.getRole().getRoleId());
       
    }

    /**
     * Test of updateUser method, of class UserDAO.
     */
//    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        UserDAO instance = new UserDAO();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserDAO.
     */
//    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int userId = 0;
        UserDAO instance = new UserDAO();
        instance.deleteUser(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userExists method, of class UserDAO.
     */
//    @Test
    public void testUserExists() {
        System.out.println("userExists");
        String userName = "";
        String email = "";
        UserDAO instance = new UserDAO();
        boolean expResult = false;
        boolean result = instance.userExists(userName, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
