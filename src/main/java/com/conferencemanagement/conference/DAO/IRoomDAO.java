/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

import com.conferencemanagement.conference.DTO.RoomDTO;

import com.conferencemanagement.conference.models.Reservation;

=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
import com.conferencemanagement.conference.DTO.RoomDTO;
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
import com.conferencemanagement.conference.DTO.RoomDTO;
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
import com.conferencemanagement.conference.models.Room;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoomDAO {
    
    public List<Room> getAllRooms();
    public Room getRoomById(int roomId);
   
    public void updateRoom(Room room);
    public void deleteRoom(int roomid);
    public void addRoom (Room room);
    boolean roomExists(String roomName);
    
}
