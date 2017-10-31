/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.RoomDAO;
import com.conferencemanagement.conference.DTO.RoomDTO;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Petar
 */
public interface IRoomService {
    
    List<Room> getAllRooms();
     public List<Room> getAllFreeRooms(Date  meetS,Date meetE);
    Room getRoomById(int roomId);
    public List<RoomDTO> getAllRoomDTO();
    boolean addRoom(Room room);
    
    boolean updateRoom(Room room);
    
    boolean deleteRoom(int roomid);
    
}
