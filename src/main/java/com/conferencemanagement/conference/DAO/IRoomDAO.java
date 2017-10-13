/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Room;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoomDAO {
    
    public List<Room> getAllRooms();
    public Room getRoomById(int roomId);
//    public Room getRoomByName(String roomName);
    public void updateRoom(Room room);
    public void deleteRoom(int roomId);
    public void addRoom (Room room);
    boolean roomExists(String roomName);
    
}
