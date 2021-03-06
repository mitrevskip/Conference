/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IReservationDAO;
import com.conferencemanagement.conference.DAO.IRoomDAO;
import com.conferencemanagement.conference.DAO.IUserDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.DTO.RoomDTO;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import com.conferencemanagement.conference.models.User;
import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private IReservationDAO resDAO;

    @Autowired
    private IUserRepository iuserrep;

    @Autowired
    private IUserDAO userDAO;

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
        if (roomDAO.roomExists(room.getRoomName())) {
            return false;
        } else {
            roomDAO.addRoom(room);
            return true;
        }
    }

    @Override
    public synchronized boolean updateRoom(Room room) {
        if (roomDAO.roomExists(room.getRoomName())) {
            return false;
        } else {
            roomDAO.addRoom(room);
            return true;
        }

    }

    @Override
    public synchronized boolean deleteRoom(int roomid) {
        Room r = roomDAO.getRoomById(roomid);
        if (roomDAO.roomExists(r.getRoomName())) {
            roomDAO.deleteRoom(roomid);
            return true;

        } else {

            return false;
        }

    }

    @Override
    public List<Room> getAllFreeRooms(Date meetS, Date meetE) {
        List<Room> Rooms = roomDAO.getAllRooms();
        List<Room> FreeRooms = new ArrayList<Room>();

        Long meetStarts = meetS.getTime();
        Long meetEnds = meetE.getTime();
        for (Room r : Rooms) {
            int i = 0;

            List<Reservation> roomRes = iuserrep.getAllReservationsByRoom(r.getRoomId());

            if (roomRes.isEmpty()) {
                FreeRooms.add(r);
            } else {

                for (Reservation res : roomRes) {
                    Long MS = res.getMeetStarts().getTime();
                    Long ME = res.getMeetEnds().getTime();

                    if (meetEnds <= MS) {
                        i++;
                    } else {
                        if (meetStarts >= ME) {
                            i++;

                        }
                    }
                    if (roomRes.size() == i) {
                        FreeRooms.add(r);
                    }
                }
            }
        }
        return FreeRooms;
    }

    @Override
    public List<RoomDTO> getAllRoomDTO() {

        List<Room> rooms = roomDAO.getAllRooms();
       
        List<RoomDTO> listRoomDTO = new ArrayList<>();
        for (Room r : rooms) {
            RoomDTO dTO = new RoomDTO();
            dTO.setRoom(r);
            dTO.setReservation(r.getReservation());       
            listRoomDTO.add(dTO);
        }
        return listRoomDTO;

    }
}
