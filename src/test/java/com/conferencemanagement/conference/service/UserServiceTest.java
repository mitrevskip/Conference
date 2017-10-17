/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.DAO.IRoleDAO;
import com.conferencemanagement.conference.DAO.IUserDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Role;
import com.conferencemanagement.conference.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class UserServiceTest {
    
    @Autowired
    IUserService userSERVICE;
    
    @Autowired
    IRoleService roleSERVICE;
    
    @Autowired
    IUserRepository iuserrep;
    
    @Autowired
    IUserDAO userDAO;
    
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
    public void testGetAllUsers() throws JsonProcessingException {
        
      
        List<User> u =  userSERVICE.getAllUsers();
        ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(u);
        System.out.println(json);
      
    }

    /**
     * Test of getUserById method, of class UserService.
     */
    @Test
    public void testGetUserById() throws JsonProcessingException {
       User u = userSERVICE.getUserById(2);
       
       ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(u);
        System.out.println(json);
       
        }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
      User u = new User();
      u.setUserName("Mario22");
      u.setPassword("aaa");
      
      Role role = new Role();
       role = iuserrep.getRoleByCat(1);
      u.setRole(role);
      
      if (userSERVICE.userExists(u.getUserName())){
          System.out.println("NE MOZE DA SE DODADE");
      }
      else {
          userSERVICE.addUser(u);
                    System.out.println("USPESNO DODAVANJE");

      }
      
    }

    /**
     * Test of updateUser method, of class UserService.
     */
    @Test
    public void testUpdateUser() {
       User u = new User();
       u = userSERVICE.getUserById(2);
       u.setUserName("MarioB");
       
       if(userSERVICE.userExists(u.getUserName())){
           System.out.println("Postoi USER so takov username");
       }
       else{
           userSERVICE.updateUser(u);
       }
    }

    /**
     * Test of deleteUser method, of class UserService.
     */
    @Test
    public void testDeleteUser() {
       userSERVICE.deleteUser(3);
    }
    
}
