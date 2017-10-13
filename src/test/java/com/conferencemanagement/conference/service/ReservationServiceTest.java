/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Reservation;
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
public class ReservationServiceTest {
    
    public ReservationServiceTest() {
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
     * Test of getAllRes method, of class ReservationService.
     */
    @Test
    public void testGetAllRes() {
        System.out.println("getAllRes");
        ReservationService instance = new ReservationService();
        List<Reservation> expResult = null;
        List<Reservation> result = instance.getAllRes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResById method, of class ReservationService.
     */
    @Test
    public void testGetResById() {
        System.out.println("getResById");
        int resId = 0;
        ReservationService instance = new ReservationService();
        Reservation expResult = null;
        Reservation result = instance.getResById(resId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRes method, of class ReservationService.
     */
    @Test
    public void testAddRes() {
        System.out.println("addRes");
        Reservation reservation = null;
        ReservationService instance = new ReservationService();
        boolean expResult = false;
        boolean result = instance.addRes(reservation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRes method, of class ReservationService.
     */
    @Test
    public void testUpdateRes() {
        System.out.println("updateRes");
        Reservation reservation = null;
        ReservationService instance = new ReservationService();
        instance.updateRes(reservation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRes method, of class ReservationService.
     */
    @Test
    public void testDeleteRes() {
        System.out.println("deleteRes");
        int resId = 0;
        ReservationService instance = new ReservationService();
        instance.deleteRes(resId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
