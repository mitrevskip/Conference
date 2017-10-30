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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
    private IHashService hashService;

    @Autowired
    public JavaMailSender sender;
    
    @Autowired
    public IUserService userService;

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
    public User getUserByEmail(String email, String userName) {
        User user = userDAO.getUserByEmail(email, userName);
        return user;
    }

    @Override
    public void forgotPassword(String email, String userName) throws Exception{
        User u = userDAO.getUserByEmail(email, userName);
        
        
        String randomPassword = RandomStringUtils.randomAlphanumeric(8);
        String hashedPassword = hashService.hashPassword(randomPassword);
        String text = "You requested that your password should be changed,"
                + " we changed it and this is it " + hashedPassword + ", please login "
                + "and change it at your earliest convenience";

//        String subject = "Password reset";
        try {
            userService.sendEmail(email, text);
        } catch (Exception ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        u.setPassword(hashedPassword);
        userDAO.updateUser(u);
        System.out.println("Password reset, check email!");
        
    }

    @Override
    public void sendEmail(String email, String text) throws Exception {

        MimeMessage message = sender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(email);

        helper.setText(text);

        helper.setSubject("Password reset");

        sender.send(message);

    }

}
