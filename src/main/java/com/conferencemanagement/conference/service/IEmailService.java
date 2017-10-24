/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

/**
 *
 * @author Petar
 */
public interface IEmailService {
    void sendPassword(String to, String subject, String text);
    
}
