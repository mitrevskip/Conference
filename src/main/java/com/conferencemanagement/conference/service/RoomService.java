/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IRoomDAO;
import com.conferencemanagement.conference.models.Room;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class RoomService implements IRoomService {

    @Autowired
    private IRoomDAO roomDAO;

    @Override
    public List<Room> getAllRooms() {
        return roomDAO.getAllRooms();
    }

    @Override
    public Room getRoomById(int roomId) {
        Room room = roomDAO.getRoomById(roomId);
        return room;
    }

    @Override
    public synchronized boolean addRoom(Room room) {
        if (roomDAO.roomExists(room.getRoomId(), room.getRoomName())) {
            return false;
        } else {
            roomDAO.addRoom(room);
            return true;
        }
    }

    @Override
    public void updateRoom(Room room) {
        roomDAO.updateRoom(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        roomDAO.deleteRoom(roomId);
    }

}
