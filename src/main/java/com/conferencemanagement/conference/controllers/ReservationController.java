/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.service.IReservationService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private IReservationService resService;

    @RequestMapping("/getall")
    public List<Reservation> getAllReservations() {
        return resService.getAllRes();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getresbyid/{resId}")
    public Reservation getResById(@PathVariable int resId) {
        return resService.getResById(resId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addReservation(@RequestBody Reservation reservation) {
        resService.addRes(reservation);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update")
    public void updateReservation(@RequestBody Reservation reservation) {
        resService.updateRes(reservation);
    }
    
    @RequestMapping(method =RequestMethod.DELETE, value = "/delete")
    public void deleteReservation(@PathVariable int resId) {
        resService.deleteRes(resId);
    }
}
