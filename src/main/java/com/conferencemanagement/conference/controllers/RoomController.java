/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.models.Room;
import com.conferencemanagement.conference.service.IRoomService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@RestController
public class RoomController {
    
    @Autowired
    private IRoomService roomService;
    
    @RequestMapping("/room")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
    
    @RequestMapping("/room/{roomId}")
    public Room getRoomById(@PathVariable int roomId) {
        return roomService.getRoomById(roomId);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/room")
    public void addRoom (@RequestBody Room room) {
        roomService.addRoom(room);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/room/{roomId}")
    public void updateRoom(@RequestBody Room room) {
        roomService.updateRoom(room);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/room/{roomId}")
    public void deleteRoom(@PathVariable int roomId) {
        roomService.deleteRoom(roomId);
    }
}
