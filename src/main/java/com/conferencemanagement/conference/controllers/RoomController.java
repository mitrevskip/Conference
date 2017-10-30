/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import com.conferencemanagement.conference.models.User;
import com.conferencemanagement.conference.service.IRoomService;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@RestController
@RequestMapping("/room")
public class RoomController {
    
    @Autowired
    private IRoomService roomService;
     @Autowired 
    private IUserRepository iuserrep;
    
    @RequestMapping("/getall")
    public List<Map<Reservation,Room>> getAllRooms() {
        
        return iuserrep.getAllRooms2();
    }
     @RequestMapping("/getallfreerooms/{meetStarts}/{meetEnds}")
     @ResponseBody
    public List<Room> getAllFreeRooms(@PathVariable("meetStarts") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetStarts, @PathVariable("meetEnds") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetEnds) {
        
        return roomService.getAllFreeRooms(meetStarts, meetEnds);
    }
    
    @RequestMapping("/getroombyid")
    public Room getRoomById(@PathVariable int roomId) {
        return roomService.getRoomById(roomId);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addRoom (@RequestBody Room room) {
        roomService.addRoom(room);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public void updateRoom(@RequestBody Room room) {
        roomService.updateRoom(room);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public void deleteRoom(@PathVariable int roomId) {
        roomService.deleteRoom(roomId);
    }
}
