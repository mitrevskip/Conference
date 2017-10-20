/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IReservationDAO {
    
    public List<Reservation> getAllRes();
    public Reservation getResById(int resId);
    public List<Room> getAvailableRooms(int meetStarts, int meetEnds);
   // public Reservation getResByMeetStarts(Date meetStarts);
    public void updateRes(Reservation reservation);
    public void deleteRes(int resId);
    public void addRes(Reservation reservation);
    boolean resExists(int resId, Date meetStarts);
    
}
