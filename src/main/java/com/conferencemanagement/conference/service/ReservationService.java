/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IReservationDAO;
import com.conferencemanagement.conference.models.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Petar
 */
public class ReservationService implements IReservationService{

    @Autowired
    private IReservationDAO resDAO;
    
    @Override
    public List<Reservation> getAllRes() {
        return resDAO.getAllRes();
    }

    @Override
    public Reservation getResById(int resId) {
        Reservation reservation = resDAO.getResById(resId);
        return reservation;
    }

    @Override
    public synchronized boolean addRes(Reservation reservation) {
        if (resDAO.resExists(reservation.getResId(), reservation.getMeetStarts())) {
            return false;
        }else{
            resDAO.addRes(reservation);
            return true;
        }
    }

    @Override
    public void updateRes(Reservation reservation) {
        resDAO.updateRes(reservation);
    }

    @Override
    public void deleteRes(int resId) {
        resDAO.deleteRes(resId);
    }
    
}
