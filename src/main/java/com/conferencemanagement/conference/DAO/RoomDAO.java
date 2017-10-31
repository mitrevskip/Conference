/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

<<<<<<< HEAD

import com.conferencemanagement.conference.DTO.RoomDTO;

import com.conferencemanagement.conference.models.Reservation;
=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
import com.conferencemanagement.conference.models.Room;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class RoomDAO implements IRoomDAO {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public List<Room> getAllRooms() {
       
        return iUserRepository.getAllRooms();
    }
    
   
    @Override
    public List<Reservation> getAllReservations(int roomId) {
        String hql = "FROM Reservation as res ORDER BY meetStarts WHERE res.roomId = ?";
        return entityManager.createQuery(hql).setParameter(1, roomId).getResultList();
        
    }

    @Override
    public Room getRoomById(int roomId) {
        return entityManager.find(Room.class, roomId);
    }

    @Override
    public void updateRoom(Room room) {
  
        entityManager.merge(room);
    }

    @Override
    public void deleteRoom(int roomid) {
        entityManager.remove(getRoomById(roomid));
    }

    @Override
    public void addRoom(Room room) {
        entityManager.persist(room);
    }

    @Override
    public boolean roomExists(String roomName) {
        String hql = "FROM Room as room1 WHERE  room1.roomName = ?";
        int count = entityManager.createQuery(hql).setParameter(1, roomName).getResultList().size();
        return count > 0 ? true : false;
    }

<<<<<<< HEAD
   
=======
    

>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
}
