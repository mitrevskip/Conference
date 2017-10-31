/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

<<<<<<< HEAD
 
import com.conferencemanagement.conference.DAO.RoomDAO;
import com.conferencemanagement.conference.DTO.RoomDTO;
 
import com.conferencemanagement.conference.models.Reservation;
=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
import com.conferencemanagement.conference.models.Room;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoomService {
    
    List<Room> getAllRooms();
 
     public List<Room> getAllFreeRooms(Date  meetS,Date meetE);
 
   
    List<Reservation> getAllReservations(int roomId);
    
 
    Room getRoomById(int roomId);
    
    boolean addRoom(Room room);
    
    boolean updateRoom(Room room);
    
    boolean deleteRoom(int roomid);
    
}
