/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Room;
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
public class RoomServiceTest {
    
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
    public void testGetAllRooms() {
        System.out.println("getAllRooms");
        RoomService instance = new RoomService();
        List<Room> expResult = null;
        List<Room> result = instance.getAllRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomById method, of class RoomService.
     */
    @Test
    public void testGetRoomById() {
        System.out.println("getRoomById");
        int roomId = 0;
        RoomService instance = new RoomService();
        Room expResult = null;
        Room result = instance.getRoomById(roomId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoom method, of class RoomService.
     */
    @Test
    public void testAddRoom() {
        System.out.println("addRoom");
        Room room = null;
        RoomService instance = new RoomService();
        boolean expResult = false;
        boolean result = instance.addRoom(room);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRoom method, of class RoomService.
     */
    @Test
    public void testUpdateRoom() {
        System.out.println("updateRoom");
        Room room = null;
        RoomService instance = new RoomService();
        instance.updateRoom(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRoom method, of class RoomService.
     */
    @Test
    public void testDeleteRoom() {
        System.out.println("deleteRoom");
        int roomId = 0;
        RoomService instance = new RoomService();
        instance.deleteRoom(roomId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
