/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DTO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import java.util.List;

/**
 *
 * @author Mario HP
 */ 

public class RoomDTO {
    
    Room room;
    
    @JsonIgnoreProperties("room")
    List<Reservation> reservation;

   
    
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }


  

    
}
