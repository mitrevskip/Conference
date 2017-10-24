/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Petar
 */
public class HashPassword {
    public static String hashPassword (String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] encodedHash = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : encodedHash) {
            sb.append(Integer.toHexString(b & 0xff));
        }
        return sb.toString();
    }
    
}
