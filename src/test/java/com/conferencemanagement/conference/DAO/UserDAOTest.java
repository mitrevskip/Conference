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
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
    
    @Autowired
    IUserRepository iuserrep;
    
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
    @Test
    public void testGetAllUsers() {
            List<User> u ;
            
            u = userDAO.getAllUsers();
            assertEquals(13, u.size());
    }

    /**
     * Test of getUserById method, of class UserDAO.
     */
    @Test
    public void testGetUserById() {
        User u = new User();
        u.setUserName("MARRIIOO2");
        userDAO.addUser(u);
        
        User u2 = userDAO.getUserById(19);
        
        assertEquals(u.getUserId(),u2.getUserId());
    }

    /**
     * Test of addUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() {
        User u = new User();
        u.setUserName("bbb2222");
        u.setPassword("aaaaa");
        u.setEmail("aaa");
        
        Role role = new Role();
        role = iuserrep.getRoleByCat(0);         
        
        u.setRole(role);
        userDAO.addUser(u);
             
        
      // assertEquals(userDAO.getUserById(15), u.toString());
       
    }

    /**
     * Test of updateUser method, of class UserDAO.
     */
    @Test
    public void testUpdateUser() {
        User u = new User();
        
        u = userDAO.getUserById(9);
        u.setEmail("NOV_MAIL");
        
        userDAO.updateUser(u);
        
        assertEquals(userDAO.getUserById(9).getEmail(), "NOV_MAIL");
    }

    /**
     * Test of deleteUser method, of class UserDAO.
     */
    @Test
    public void testDeleteUser() {
        userDAO.deleteUser(10);
        assertEquals(11, userDAO.getAllUsers().size());
    }

    /**
     * Test of userExists method, of class UserDAO.
     */
    @Test
    public void testUserExists() {
        
        
        
        assertEquals(true, userDAO.userExists("bbb", "aaa"));
        
        
    }
    
    
}
