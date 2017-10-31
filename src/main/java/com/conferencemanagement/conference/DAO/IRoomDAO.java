/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;


import com.conferencemanagement.conference.DTO.RoomDTO;

import com.conferencemanagement.conference.models.Reservation;

import com.conferencemanagement.conference.models.Room;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoomDAO {
    
    public List<Room> getAllRooms();
    public List<Reservation> getAllReservations(int roomId);
    public Room getRoomById(int roomId);
   public List<RoomDTO> getAllRooms2();
    public void updateRoom(Room room);
    public void deleteRoom(int roomid);
    public void addRoom (Room room);
    boolean roomExists(String roomName);
  
}
