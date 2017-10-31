/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import com.conferencemanagement.conference.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class ReservationServiceTest {
    
    @Autowired
    IReservationService resService;
    
    @Autowired
    IUserService iuserrep;
    
    @Autowired
    IRoomService roomService;
    
    @Autowired
    IUserService userService;
    
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
    public void testGetAllRes() throws JsonProcessingException {
        List<Reservation> r = resService.getAllRes();
        
        ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(r);
        System.out.println(json);
        
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
    public void testAddRes() throws ParseException {
        Reservation res = new Reservation();
            
        String resStarts = "03-12-2017 17:00";
        String resEnds = "03-12-2017 18:00";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        Room room = new Room();
        room = roomService.getRoomById(2);
        res.setRoom(room);
        
        User u = new User();
        u = userService.getUserById(1);
        res.setUser(u);
        List<Reservation> resv= new ArrayList<>();
        
        resv.add(res);
        u.setReservations(resv);
        res.setUser(u);
        userService.updateUser(u);
        
        resService.addRes(res);
        
     
    }

    /**
     * Test of updateRes method, of class ReservationService.
     */
    @Test
    public void testUpdateRes() {
        System.out.println("updateRes");
        Reservation reservation = null;
        ReservationService instance = new ReservationService();
        boolean expResult = false;
        boolean result = instance.updateRes(reservation);
        assertEquals(expResult, result);
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
