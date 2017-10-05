/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Petar
 */
public class ReservationDAO implements IReservationDAO{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Reservation> getAllReservations() {
        String hql = "FROM Reservation as res1 ORDER BY res1.resId";
        return (List<Reservation>)entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Reservation getReservationById(int id) {
        return entityManager.find(Reservation.class, id);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        Reservation res1 = getReservationById(reservation.getId());
        res1.setRoom(reservation.getRoom());
        res1.setMeetingStart(reservation.getMeetingStart());
        res1.setMeetingEnd(reservation.getMeetingEnd());
        
    }

    @Override
    public void deleteReservation(int id) {
        entityManager.remove(getReservationById(id));
    }

    @Override
    public void addReservation(Reservation reservation) {
        entityManager.persist(reservation);
    }

    @Override
    public boolean reservationExists(int id) {
        String hql = "FROM Reservation as res1 WHERE res1.id = ?";
        int count = entityManager.createQuery(hql)
                .setParameter(1, id).getResultList().size();
        return count > 0 ? true : false;
    }
    
}
