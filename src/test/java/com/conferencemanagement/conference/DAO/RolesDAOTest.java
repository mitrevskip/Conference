/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Roles;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;


/**
 *
 * @author Mario HP
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
@Transactional
public class RolesDAOTest {
    
    @Autowired
    RolesDAO rolesDAO;
    
    public RolesDAOTest() {
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
     * Test of getAllRoles method, of class RolesDAO.
     */
//    @Test
//    public void testGetAllRoles() {
//       
//    }
//
//    /**
//     * Test of getRolesById method, of class RolesDAO.
//     */
//    @Test
//    public void testGetRolesById() {
//        
//    }
//
//    /**
//     * Test of updateRoles method, of class RolesDAO.
//     */
//    @Test
//    public void testUpdateRoles() {
//       
//    }
//
//    /**
//     * Test of deleteRoles method, of class RolesDAO.
//     */
//    @Test
//    public void testDeleteRoles() {
//      
//    }
//
//    /**
//     * Test of rolesExists method, of class RolesDAO.
//     */
//    @Test
//    public void testRolesExists() {
//       
//    }

    /**
     * Test of addRoles method, of class RolesDAO.
     */
    @Test
    public void testAddRoles() {
        
        Roles roles= new Roles();
        roles.setCategory(5);
              
        rolesDAO.addRoles(roles);
        
        Roles result;
        result = rolesDAO.getRolesById(1);
        
        
        
        assertEquals(roles, result);
        
    }
    
}
