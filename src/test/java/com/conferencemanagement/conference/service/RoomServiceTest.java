/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Room;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
public class RoomServiceTest {
    
    @Autowired
    IRoomService roomService;
    
    public RoomServiceTest() {
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
     * Test of getAllRooms method, of class RoomService.
     */
    @Test
    public void testGetAllRooms() throws JsonProcessingException {
       List<Room> r = roomService.getAllRooms();
       ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(r);
        System.out.println(json);
         assertEquals(2, r.size());
    }

    /**
     * Test of getRoomById method, of class RoomService.
     */
    @Test
    public void testGetRoomById() throws JsonProcessingException {
        Room r = new Room();
        r = roomService.getRoomById(2);
        ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(r);
        System.out.println(json);
         
    }

    /**
     * Test of addRoom method, of class RoomService.
     */
    @Test
    public void testAddRoom() {
        Room r = new Room();
        r.setCapacity(14);
        r.setDesc("NOVA SOBA 2sdfsdfsdfsd2222");
        r.setRoomName("ROOOMvv2222222222");
        roomService.addRoom(r);
        assertEquals(4, roomService.getAllRooms().size());
        
    }

    /**
     * Test of updateRoom method, of class RoomService.
     */
    @Test
    public void testUpdateRoom() {
     Room r = new Room();
     r = roomService.getRoomById(3);
     r.setRoomName("Conference 5");
     r.setDesc("Large video");
     r.setCapacity(17);
     roomService.updateRoom(r);
    }

    /**
     * Test of deleteRoom method, of class RoomService.
     */
    @Test
    public void testDeleteRoom() {
       
      roomService.deleteRoom(5);
    }

    /**
     * Test of getAllFreeRooms method, of class RoomService.
     */
    @Test
    public void testGetAllFreeRooms() throws ParseException, JsonProcessingException {
        System.out.println("getAllFreeRooms");
        List<Room> r;
        String resStarts = "2017-03-12 10:00";
        String resEnds = "2017-03-12 15:00";

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
//        Long DS = dateS.getTime();
//        Long DE = dateE.getTime();
        r = roomService.getAllFreeRooms(dateS,dateE);
          ObjectMapper mapper = new ObjectMapper();
        
        String json = mapper.writeValueAsString(r);
        System.out.println(json);
        
    }
    
}
