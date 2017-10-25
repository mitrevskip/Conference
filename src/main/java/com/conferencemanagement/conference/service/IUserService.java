/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.User;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IUserService {

    List<User> getAllUsers();

    List<Reservation> getAllReservations(int userId);

    User getUserById(int userId);

    User getUserByEmail(String email);

    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int userId);

    boolean userExists(String userName);

    void forgotPassword(String email);

}
