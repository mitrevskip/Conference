/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Room;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
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

    @Override
    public List<Room> getAllRooms() {
       String hql = "FROM Room as room1 ORDER BY room1.roomId";
//         String hql = "SELECT r FROM Room r JOIN r.reservation res JOIN res.user u WHERE r.roomId='2'";
        return (List<Room>) entityManager.createQuery(hql).getResultList();
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

}
