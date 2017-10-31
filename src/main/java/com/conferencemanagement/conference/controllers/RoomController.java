/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.DAO.IUserRepository;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
import com.conferencemanagement.conference.DTO.RoomDTO;
=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
    public  List<RoomDTO>  getAllRooms() {
=======
    public List<Map<Reservation,Room>> getAllRooms() {
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
        
        return iuserrep.getAllRooms2();
    }
<<<<<<< HEAD
     @RequestMapping(method = RequestMethod.GET, value = "/getallfreerooms/{meetStarts}/{meetEnds}")
    public List<Room> getAllFreeRooms(@PathVariable Long meetStarts, @PathVariable Long meetEnds) {
        Date MS = new Date(meetStarts);
        Date ME = new Date(meetEnds);
        return roomService.getAllFreeRooms(MS,ME);
    }
    
    @RequestMapping("/{roomId}")
=======
     @RequestMapping("/getallfreerooms/{meetStarts}/{meetEnds}")
     @ResponseBody
    public List<Room> getAllFreeRooms(@PathVariable("meetStarts") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetStarts, @PathVariable("meetEnds") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetEnds) {
        
        return roomService.getAllFreeRooms(meetStarts, meetEnds);
    }
    
    @RequestMapping("/getroombyid")
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
    public List<Map<Reservation,Room>> getAllRooms() {
        
        return iuserrep.getAllRooms2();
    }
     @RequestMapping("/getallfreerooms/{meetStarts}/{meetEnds}")
     @ResponseBody
    public List<Room> getAllFreeRooms(@PathVariable("meetStarts") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetStarts, @PathVariable("meetEnds") @DateTimeFormat(pattern="yyyy-dd-MM HH:mm") Date meetEnds) {
        
        return roomService.getAllFreeRooms(meetStarts, meetEnds);
    }
    
    @RequestMapping("/getroombyid")
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
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
