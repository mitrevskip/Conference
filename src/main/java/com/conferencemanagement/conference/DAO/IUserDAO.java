/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.User;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IUserDAO {
    
    
    List<User> getAllUsers();
    List<Reservation> getAllReservations(int userId);
    User getUserById(int userId);
    User getUserByEmail(String email, String userName);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean userExists(String userName);
    boolean emailExists(String email);
    
    
}
