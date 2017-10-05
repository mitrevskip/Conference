/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Roles;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;



/**
 *
 * @author Mario HP
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
 public class RolesDAOTest {
    
    @Autowired
    IRolesDAO rolesDAO;
    
 
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
   
    @Transactional
    @Test
     public void testAddRoles() {
//        System.out.println("1"); 
//        Roles roles = new Roles();
//        roles.setCategory(0);
//        
//        rolesDAO.addRoles(roles);
//        
//        
//        assertEquals(2, roles.getRolesId());
//      
//        
      
        
    }
    @Transactional()
    @Test()
    public void testGetAllRoles() {
       System.out.println("2");
       List<Roles> lista;
        
        lista = rolesDAO.getAllRoles();
        
        
        
        
        
       
    }

    /**
     * Test of getRolesById method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testGetRolesById() {
           System.out.println("3");
        Roles result;
                
      result= rolesDAO.getRolesById(1);
      
      Roles expRes = new Roles();
      expRes.setRolesId(1);
      expRes.setCategory(0);
        assertEquals(expRes , result);
     
    }

    /**
     * Test of updateRoles method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testUpdateRoles() {
        System.out.println("4");
        Roles roles = new Roles();
        roles.setRolesId(1);
        roles.setCategory(1);
        
        rolesDAO.updateRoles(roles);
        
        Roles result = new Roles();
        
        result = rolesDAO.getRolesById(1);
        
        assertEquals(roles,result);
        
       
    }

    /**
     * Test of deleteRoles method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testDeleteRoles() {
        System.out.println("5");
        Roles roles;
      roles = rolesDAO.getRolesById(1);
     
      
       rolesDAO.deleteRoles(1);
      
       
      
    }

    /**
     * Test of rolesExists method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testRolesExists() {
      System.out.println("6");
      boolean postoi;
        
      postoi = rolesDAO.rolesExists(1, 0);
         
      assertEquals(true, postoi);
      
    }

    /**
     * Test of addRoles method, of class RolesDAO.
     */

    // KAKO DA NAPRAVAM CLEAR ?????????
}
