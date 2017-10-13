/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Role;
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
 public class RoleDAOTest {
    
    @Autowired
    IRoleDAO roleDAO;
    
 
    public RoleDAOTest() {
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
   
//    @Transactional
    @Test
     public void testAddRole() {
        
        Role role = new Role();
        role.setCategory(0);
        roleDAO.addRole(role);
        
         Role role2 = new Role();
        role2.setCategory(1);
        roleDAO.addRole(role2);
        
         Role role3 = new Role();
        role3.setCategory(2);
        roleDAO.addRole(role3);
        
        assertEquals(1, role.getRoleId());
      
        
      
        
    }
    @Transactional()
    @Test()
    public void testGetAllRoles() {
       System.out.println("2");
       List<Role> lista;
        
        lista = roleDAO.getAllRoles();
        
        assertEquals(lista.size(),3 );
        
        
        
       
    }

    /**
     * Test of getRolesById method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testGetRoleById() {
           System.out.println("3");
        Role result;
                
      result= roleDAO.getRoleById(1);
      
      Role expRes = new Role();
      expRes.setRoleId(1);
      expRes.setCategory(0);
        assertEquals(expRes , result);
     
    }

    /**
     * Test of updateRoles method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testUpdateRole() {
        System.out.println("4");
        Role role = new Role();
        role.setRoleId(1);
        role.setCategory(1);
        
        roleDAO.updateRole(role);
        
        Role result = new Role();
        
        result = roleDAO.getRoleById(1);
        
        assertEquals(role,result);
        
       
    }

    /**
     * Test of deleteRoles method, of class RolesDAO.
     */
     
//    @Test
//    public void testDeleteRole() {
//       
//        Role role;
//      role = roleDAO.getRoleById(1);
//     
//      
//       roleDAO.deleteRole(2);
//       
//        assertEquals(roleDAO.getAllRoles().size(), 2);
//      
//       
//      
//    }

    /**
     * Test of rolesExists method, of class RolesDAO.
     */
    @Transactional
    @Test
    public void testRoleExists() {
      System.out.println("6");
      boolean postoi;
        
      postoi = roleDAO.roleExists(1, 0);
         
      assertEquals(true, postoi);
      
    }

    /**
     * Test of addRoles method, of class RolesDAO.
     */

    // KAKO DA NAPRAVAM CLEAR ?????????
}
