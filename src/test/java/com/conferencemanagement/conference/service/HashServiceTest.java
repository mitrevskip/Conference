/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.DAO.IUserDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.User;
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
 * @author Petar
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
public class HashServiceTest {

    @Autowired
    IHashService hashService;

    @Autowired
    IUserDAO userDAO;

    @Autowired
    IUserService userSERVICE;

    @Autowired
    IRoleService roleSERVICE;

    @Autowired
    IUserRepository iuserrep;

    public HashServiceTest() {
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
     * Test of hashPassword method, of class HashService.
     */
    @Test
    public void testHashPassword() {

        User u = userDAO.getUserById(12);
        String passToHash = "hashed";
        String hashedPassword = hashService.hashPassword(passToHash);
        u.setPassword(hashedPassword);
        userSERVICE.updateUser(u);
        System.out.println("hashPassword");

        String expResult = hashedPassword;

        assertEquals(expResult, u.getPassword());

    }

}
