/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
 * @author Petar
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
public class ReservationDAOTest {
    
    @Autowired
    IReservationDAO resDAO;
    
    @Autowired
    IRoomDAO roomDAO;
    
    public ReservationDAOTest() {
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
     * Test of getAllRes method, of class ReservationDAO.
     */
//    @Test
    public void testGetAllRes() {
        System.out.println("getAllRes");
        ReservationDAO instance = new ReservationDAO();
        List<Reservation> expResult = null;
        List<Reservation> result = instance.getAllRes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResById method, of class ReservationDAO.
     */
//    @Test
    public void testGetResById() {
        System.out.println("getResById");
        int resId = 0;
        ReservationDAO instance = new ReservationDAO();
        Reservation expResult = null;
        Reservation result = instance.getResById(resId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResByMeetStarts method, of class ReservationDAO.
     */
//    @Test
    public void testGetResByMeetStarts() {
        System.out.println("getResByMeetStarts");
        LocalDateTime meetStarts = null;
        ReservationDAO instance = new ReservationDAO();
        Reservation expResult = null;
        Reservation result = instance.getResByMeetStarts(meetStarts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRes method, of class ReservationDAO.
     */
//    @Test
    public void testUpdateRes() {
        System.out.println("updateRes");
        Reservation reservation = null;
        ReservationDAO instance = new ReservationDAO();
        instance.updateRes(reservation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRes method, of class ReservationDAO.
     */
//    @Test
    public void testDeleteRes() {
        System.out.println("deleteRes");
        int resId = 0;
        ReservationDAO instance = new ReservationDAO();
        instance.deleteRes(resId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRes method, of class ReservationDAO.
     */
    @Test
    public void testAddRes() {
        Reservation res = new Reservation();
        Room room = roomDAO.getRoomById(2);
        
       
        res.setRoom(room);
        
        String resStarts = "2017-12-03 10:30";
        String resEnds = "2017-12-03 11:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm");
        LocalDateTime formatDateTimeStarts = LocalDateTime.parse(resStarts, formatter);
        LocalDateTime formatDateTimeEnds = LocalDateTime.parse(resEnds, formatter);
        
        res.setMeetStarts(formatDateTimeStarts);
        res.setMeetEnds(formatDateTimeEnds);
        
        resDAO.addRes(res);
        
        
        
        
//        System.out.println("addRes");
//        Reservation reservation = null;
//        ReservationDAO instance = new ReservationDAO();
//        instance.addRes(reservation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of resExists method, of class ReservationDAO.
     */
//    @Test
    public void testResExists() {
        System.out.println("resExists");
        int resId = 0;
        LocalDateTime meetStarts = null;
        ReservationDAO instance = new ReservationDAO();
        boolean expResult = false;
        boolean result = instance.resExists(resId, meetStarts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
