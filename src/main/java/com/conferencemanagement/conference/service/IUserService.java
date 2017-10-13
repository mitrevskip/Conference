/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.User;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IUserService {
    
    List<User> getAllUsers();
    
    User getUserById(int userId);
    
    boolean addUser(User user);
    
    void updateUser(User user);
    
    void deleteUser(int userId);
    
}
