/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IUserDAO;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Role;
 
import com.conferencemanagement.conference.models.Reservation;
 
=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Role;
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Role;
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
import com.conferencemanagement.conference.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class UserService implements IUserService{
    @Autowired
    private IUserDAO userDAO;
    
    
<<<<<<< HEAD
    
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int userId) {
        User user1 = userDAO.getUserById(userId);
        return user1;
    }

    @Override
    public synchronized boolean addUser(User user) {
        if (userDAO.userExists(user.getUserName())) {
            return false;
        }else{
<<<<<<< HEAD
//            Role r = new Role();
//            r = iuserrep.getRoleByCat(rid);
//            user.setRole(r);
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of a8c0438... DEMO+ ROOM DTO
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
=======
>>>>>>> parent of 327d884... Merge branch 'In-Development' into Mario-Development
            userDAO.addUser(user);
            return true;
        }
    }

    @Override
    public synchronized boolean updateUser(User user) {
         if (userDAO.userExists(user.getUserName())) {
            return false;
        }else{
            userDAO.updateUser(user);
            return true;
        }
         
    }

    @Override
    public synchronized boolean deleteUser(int userId) {
        User u = userDAO.getUserById(userId);
        if (userDAO.userExists(u.getUserName())) {
           userDAO.deleteUser(userId);
            return true;
        }else{
           return false;
        }
        
    }

    @Override
    public boolean userExists(String userName) {
        if (userDAO.userExists(userName)) {
            return true;
        }else{
            
            return false;
        }
    }
    
}
