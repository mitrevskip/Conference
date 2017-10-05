/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Mario HP
 */
@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int userId;
    
    @Column(name = "email",unique = true)
    private String email;
    
    @Column(name = "username", unique = true)
    private String userName;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "log")
    private boolean log;
    
    @OneToOne(cascade = CascadeType.PERSIST,mappedBy = "User")
    private Role role;
    
    List<Reservation> Reservations;
}