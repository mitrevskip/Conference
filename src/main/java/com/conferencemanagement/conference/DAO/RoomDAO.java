/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Room;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Petar
 */
public class RoomDAO implements IRoomDAO{
    
    private EntityManager entityManager;

    @Override
    public List<Room> getAllRooms() {
        String hql = "FROM Room as room1 ORDER BY room1.id";
        return (List<Room>)entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Room getRoomById(int id) {
        return entityManager.find(Room.class, id);
    }

    @Override
    public void updateRoom(Room room) {
        Room room1 = getRoomById(room.getId());
        room1.setCapacity(room.getCapacity());
        room1.setDescription(room.getDescription());
        room1.setRoomName(room.getRoomName());
    }

    @Override
    public void deleteRoom(int id) {
        entityManager.remove(getRoomById(id));
    }

    @Override
    public void addRoom(Room room) {
        entityManager.persist(room);
    }

    @Override
    public boolean roomExists(int id, String roomName) {
        String hql = "FROM Room as room1 WHERE room1.id = ? and room1.roomName = ?";
        int count = entityManager.createQuery(hql).setParameter(1, id)
                .setParameter(2, roomName).getResultList().size();
        return count > 0 ? true : false;
    }
    
}
