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
    @Test
    public void testGetAllRooms() {
        List<Room> r;
        r = roomDAO.getAllRooms();
        assertEquals(roomDAO.getAllRooms().size(), 0);
        
    }

    /**
     * Test of getRoomById method, of class RoomDAO.
     */
    @Test
    public void testGetRoomById() {
        Room r = new Room();
        r.setRoomName("Conference3");
        roomDAO.addRoom(r);
        
        Room r2 = roomDAO.getRoomById(1);
        assertEquals(r.getRoomId(), r2.getRoomId());
    }

    /**
     * Test of updateRoom method, of class RoomDAO.
     */
    @Test
    public void testUpdateRoom() {
       Room r = new Room();
       r.setCapacity(15);
       r.setDesc("Big Hall");
       r.setRoomName("Big Bang");
       roomDAO.addRoom(r);
       
       r = roomDAO.getRoomById(1);
       
       
       roomDAO.updateRoom(r);
        assertEquals(roomDAO.getRoomById(1).getDesc(), "Big Hall");
    }

    /**
     * Test of deleteRoom method, of class RoomDAO.
     */
    @Test
    public void testDeleteRoom() {
       Room r = new Room();
       r.setCapacity(15);
       r.setDesc("Big Hall");
       r.setRoomName("Big Bang");
       roomDAO.addRoom(r);
       
       roomDAO.deleteRoom(1);
        assertEquals(0, roomDAO.getAllRooms().size());
    }

    /**
     * Test of addRoom method, of class RoomDAO.
     */
    @Test
    public void testAddRoom() {
        Room r = new Room();
        r.setRoomName("Conference 3");
        r.setCapacity(25);
        r.setDesc("Large video conferencing room (air conditioned)");
        
        roomDAO.addRoom(r);
        
    //    assertEquals(roomDAO.getAllRooms().size(), 1);
        
    }

    /**
     * Test of roomExists method, of class RoomDAO.
     */
    @Test
    public void testRoomExists() {
        Room r = new Room();
        r.setRoomName("Conference 2");
        r.setCapacity(30);
        r.setDesc("Large video conferencing room (air conditioned)");
        
        roomDAO.addRoom(r);
        
        assertEquals(true, roomDAO.roomExists(1, "Conference 2"));
    }
    
}
