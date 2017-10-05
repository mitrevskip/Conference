/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mario HP
 */
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meeting starts")
    LocalDateTime meetingStart;

    @Column(name = "meeting ends")
    LocalDateTime meetingEnd;
    
    Room room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMeetingStart() {
        return meetingStart;
    }

    public void setMeetingStart(LocalDateTime meetingStart) {
        this.meetingStart = meetingStart;
    }

    public LocalDateTime getMeetingEnd() {
        return meetingEnd;
    }

    public void setMeetingEnd(LocalDateTime meetingEnd) {
        this.meetingEnd = meetingEnd;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
}