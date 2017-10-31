/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
public class Reservation implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resId;
    
    private Date meetStarts;
    private Date meetEnds;
    
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

    boolean allDay=false;
    

    private String reservationTitle;
        

=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
    boolean allDay=false;
    
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
    boolean allDay=false;
    
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
    boolean allDay=false;
    
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ROOM_ID")
   @JsonIgnoreProperties("reservations")
//    @JsonBackReference
    private Room room;
    
    
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "USER_ID")
    @JsonIgnoreProperties("reservations")
   //@JsonBackReference
    private User user;
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

    
    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public Date getMeetStarts() {
        return meetStarts;
    }

    public void setMeetStarts(Date meetStarts) {
        this.meetStarts = meetStarts;
    }

    public Date getMeetEnds() {
        return meetEnds;
    }

    public void setMeetEnds(Date meetEnds) {
        this.meetEnds = meetEnds;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.resId;
        hash = 59 * hash + Objects.hashCode(this.meetStarts);
        hash = 59 * hash + Objects.hashCode(this.meetEnds);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.resId != other.resId) {
            return false;
        }
        if (!Objects.equals(this.meetStarts, other.meetStarts)) {
            return false;
        }
        if (!Objects.equals(this.meetEnds, other.meetEnds)) {
            return false;
        }
        return true;
    }

  
    

    
    
}
