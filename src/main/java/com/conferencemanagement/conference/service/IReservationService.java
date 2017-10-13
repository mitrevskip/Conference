/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Reservation;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IReservationService {
    
    List<Reservation> getAllRes();
    
    Reservation getResById(int resId);
    
    boolean addRes(Reservation reservation);
    
    boolean updateRes(Reservation reservation);
    
    void deleteRes(int resId);
}
