/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IReservationDAO {
    
    public List<Reservation> getAllReservations();
    public Reservation getReservationById(int id);
    public void updateReservation(Reservation reservation);
    public void deleteReservation(int id);
    public void addReservation(Reservation reservation);
    boolean reservationExists(int id);
    
}
