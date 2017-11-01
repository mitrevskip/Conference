/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.User;
import com.conferencemanagement.conference.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /*Works through Postman*/
    @RequestMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/getAllReservations/{userId}")
    public List<Reservation> getAllReservations(@PathVariable int userId) {
        return userService.getAllReservations(userId);
    }

    /*Works through Postman*/
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    /*Works through Postman*/
    @RequestMapping(method = RequestMethod.POST, value = "/add", consumes = "application/json")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update", consumes = "application/json")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    /*Works with Postman*/
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/forgotpassword/{email}/{userName}")
    public void forgotPassword(@PathVariable String email, @PathVariable String userName) throws Exception {
        userService.forgotPassword(email, userName);
        System.out.println("Password reset, email sent");
        
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getuserbyemail/{email}/{userName}")
    @ResponseBody
    public User getUserByEmail(@PathVariable("email") String email, @PathVariable("userName") String userName) {
        return userService.getUserByEmail(email, userName);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/sendemail/{email}/{text}") 
    public void sendEmal(@PathVariable("email") String email, @PathVariable("text") String text) throws Exception {
        userService.sendEmail(email, text);
    }
}
