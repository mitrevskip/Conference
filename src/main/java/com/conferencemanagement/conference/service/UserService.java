/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IUserDAO;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.User;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Autowired
    private IEmailService emailService;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public List<Reservation> getAllReservations(int userId) {
        return userDAO.getAllReservations(userId);
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
        } else {
            userDAO.addUser(user);
            return true;
        }
    }

    @Override
    public synchronized boolean updateUser(User user) {
        if (userDAO.userExists(user.getUserName())) {
            userDAO.updateUser(user);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public synchronized boolean deleteUser(int userId) {
        User u = userDAO.getUserById(userId);
        if (userDAO.userExists(u.getUserName())) {
            userDAO.deleteUser(userId);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean userExists(String userName) {
        if (userDAO.userExists(userName)) {
            return true;
        } else {

            return false;
        }
    }

    @Override
    public void forgotPassword(String email) {
        User u = userDAO.getUserByEmail(email);
        if (userDAO.emailExists(email)) {

            String randomPassword;
            randomPassword = new RandomStringUtils().randomAlphanumeric(8);
            String text = "You requested that your password should be changed,"
                + " we changed it and this is it " + randomPassword + ", please login "
                + "and change it at your earliest convenience";

            u.setPassword(randomPassword);
            emailService.sendPassword(email, "Password Changed", text);

        } else {
            System.out.println("No such email in database!");
        }
    }

}
