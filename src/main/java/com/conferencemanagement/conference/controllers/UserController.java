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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/getAllReservations/{userId}")
    public List<Reservation> getAllReservations(@PathVariable int userId) {
        return userService.getAllReservations(userId);
    }

    @RequestMapping("/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{userId}")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);

    }

    @RequestMapping("/forgotPassword/{email}")
    public void forgotPassword(@PathVariable String email) {
//        userService.forgotPassword(email);
        System.out.println("zdravo");
    }
}
