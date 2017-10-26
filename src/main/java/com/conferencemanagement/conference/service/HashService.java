/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IUserDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class HashService implements IHashService {
    
    @Autowired
    IHashService hashService;
    
    @Autowired
    IUserDAO userDAO;
    
    @Autowired
    IUserService userSERVICE;
    
    @Autowired
    IRoleService roleSERVICE;
    
    @Autowired
    IUserRepository iuserrep;

    @Override
    public String hashPassword(String password) {

        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString(bytes[i] & 0xff));
            }
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }
}
