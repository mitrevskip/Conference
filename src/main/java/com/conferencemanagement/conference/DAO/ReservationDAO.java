/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import java.time.LocalDateTime;
import java.util.Date;
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
public class ReservationDAO implements IReservationDAO{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Reservation> getAllRes() {
        String hql = "FROM Reservation as res1 ORDER BY res1.resId";
        return (List<Reservation>)entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Reservation getResById(int resId) {
        return entityManager.find(Reservation.class, resId);
    }

//    @Override
//    public Reservation getResByMeetStarts(Date meetStarts) {
//        return entityManager.find(Reservation.class, meetStarts);
//    }

    @Override
    public void updateRes(Reservation reservation) {
       entityManager.merge(reservation);
    }

    @Override
    public void deleteRes(int resId) {
        entityManager.remove(getResById(resId));
    }

    @Override
    public void addRes(Reservation reservation) {
        entityManager.persist(reservation);
    }

    public boolean resExists(int resId, Date meetStarts) {
        String hql = "FROM Reservation as res1 WHERE res1.resId = ? and res1.meetStarts = ?";
        int count = entityManager.createQuery(hql).setParameter(1, resId)
                .setParameter(2, meetStarts).getResultList().size();
        return count > 0 ? true : false;
    }

   
    
}
