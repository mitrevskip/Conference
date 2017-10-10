/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RES_ID")
    private int resId;
    
    private LocalDateTime meetStarts;
    private LocalDateTime meetEnds;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ROOM_ID")
    private Room room;
    
    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public LocalDateTime getMeetStarts() {
        return meetStarts;
    }

    public void setMeetStarts(LocalDateTime meetStarts) {
        this.meetStarts = meetStarts;
    }

    public LocalDateTime getMeetEnds() {
        return meetEnds;
    }

    public void setMeetEnds(LocalDateTime meetEnds) {
        this.meetEnds = meetEnds;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    

    
    
}
