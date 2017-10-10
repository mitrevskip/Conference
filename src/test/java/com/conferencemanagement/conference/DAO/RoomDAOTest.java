/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Room;
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
public class RoomDAOTest {
    
    @Autowired
    IRoomDAO roomDAO;
    
    @Autowired
    IReservationDAO resDAO;
    
    public RoomDAOTest() {
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
     * Test of getAllRooms method, of class RoomDAO.
     */
//    @Test
    public void testGetAllRooms() {
        System.out.println("getAllRooms");
        RoomDAO instance = new RoomDAO();
        List<Room> expResult = null;
        List<Room> result = instance.getAllRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomById method, of class RoomDAO.
     */
//    @Test
    public void testGetRoomById() {
        System.out.println("getRoomById");
        int roomId = 0;
        RoomDAO instance = new RoomDAO();
        Room expResult = null;
        Room result = instance.getRoomById(roomId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRoom method, of class RoomDAO.
     */
//    @Test
    public void testUpdateRoom() {
        System.out.println("updateRoom");
        Room room = null;
        RoomDAO instance = new RoomDAO();
        instance.updateRoom(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRoom method, of class RoomDAO.
     */
//    @Test
    public void testDeleteRoom() {
        System.out.println("deleteRoom");
        int roomId = 0;
        RoomDAO instance = new RoomDAO();
        instance.deleteRoom(roomId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoom method, of class RoomDAO.
     */
    @Test
    public void testAddRoom() {
        Room r = new Room();
        r.setRoomName("Conference 2");
        r.setCapacity(30);
        r.setDesc("Large video conferencing room (air conditioned)");
        
        roomDAO.addRoom(r);
        
        assertEquals(roomDAO.getAllRooms().size(), 1);
        
//        System.out.println("addRoom");
//        Room room = null;
//        RoomDAO instance = new RoomDAO();
//        instance.addRoom(room);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of roomExists method, of class RoomDAO.
     */
//    @Test
    public void testRoomExists() {
        System.out.println("roomExists");
        int roomId = 0;
        String roomName = "";
        RoomDAO instance = new RoomDAO();
        boolean expResult = false;
        boolean result = instance.roomExists(roomId, roomName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
