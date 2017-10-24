/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoomService {
    
    List<Room> getAllRooms();
   
    List<Reservation> getAllReservations(int roomId);
    
    Room getRoomById(int roomId);
    
    boolean addRoom(Room room);
    
    boolean updateRoom(Room room);
    
    boolean deleteRoom(int roomid);
    
}
