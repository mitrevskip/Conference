/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IReservationDAO;
import com.conferencemanagement.conference.DAO.IRoomDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
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
    IUserRepository iuserrep;
   

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
    public List<Room> getAllFreeRooms(Long meetStarts, Long meetEnds) {
       List<Room> Rooms = roomDAO.getAllRooms();
       List<Room> FreeRooms = new ArrayList<Room>();
         
       boolean free = false;
       boolean free2 = true;
                
        for (Room r : Rooms) {
            free = false;
            free2 = true;
            List<Reservation> roomRes =iuserrep.getAllReservationsByRoom(r.getRoomId()) ;
                 if(r.getReservation().isEmpty()){ 
                 free = true;
                 }      
            for(Reservation res : roomRes){    
          //     if(resDAO.resExistsInTimeInterval(r.getRoomId())){
                   Long MS = resDAO.getResById(r.getRoomId()).getMeetStarts().getTime();
                   Long ME = resDAO.getResById(r.getRoomId()).getMeetEnds().getTime();
                   if(meetEnds <= MS){
                         free = true;                                       
                   }else{
                       if(meetStarts >= ME){
                            free = true;   
                       }
                   } 
                   if ( free == false ) free2=false; 
             //  }
                     
           }
            if (free2 == true ) FreeRooms.add(r);    
        }     
       return FreeRooms;
    }

}
