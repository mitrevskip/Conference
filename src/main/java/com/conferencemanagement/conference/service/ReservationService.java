/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IReservationDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class ReservationService implements IReservationService{

    @Autowired
    private IReservationDAO resDAO;
    
    @Autowired
    private IUserRepository iuserrep;
    
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
    public boolean updateRes(Reservation reservation) {
        if(iuserrep.resRoomExists(reservation.getRoom().getRoomId(), reservation.getMeetStarts())) {
            return false;
        }
        else {
            resDAO.updateRes(reservation);
            return true;
        }
        
    }

    @Override
    public synchronized boolean deleteRes(int resId) {
        Reservation reservation = resDAO.getResById(resId);
        if (resDAO.resExists(reservation.getResId(), reservation.getMeetStarts())) {
             resDAO.deleteRes(resId);
            return true;
        }else{
            return false;
        }
        
    }
    
}
