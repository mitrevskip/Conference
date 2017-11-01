/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import com.conferencemanagement.conference.service.IReservationService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@CrossOrigin
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private IReservationService resService;

    @RequestMapping("/getall")
    public List<Reservation> getAllReservations() {
        return resService.getAllRes();
    }
    
    /*Gets all available room for given time frame*/
    @RequestMapping("/getavailablerooms/{meetStarts}/{meetEnds}")
    public List<Room> getAvailableRooms(@PathVariable("meetStarts") int meetStarts, @PathVariable("meetEnds") int meetEnds) {
        return resService.getAvailableRooms(meetStarts, meetEnds);
    }

    /*returns reservation object upon receiving reservation ID*/
    @RequestMapping("/{resId}")
    public Reservation getResById(@PathVariable int resId) {
        return resService.getResById(resId);
    }

    /*Adds reservation*/
    @RequestMapping(method = RequestMethod.POST, value = "/add", consumes = "application/json")
    public void addReservation(@RequestBody Reservation reservation) {
        resService.addRes(reservation);
    }
    
    /*Updates reservation upon receiving reservation ID and reservation object*/
    @RequestMapping(method = RequestMethod.PUT, value = "/update", consumes = "application/json")
    public void updateReservation(@RequestBody Reservation reservation) {
        resService.updateRes(reservation);
    }
    /*Deletes reservation upon receiving reservation ID*/
    @RequestMapping(method =RequestMethod.DELETE, value = "/delete/{resId}")
    public void deleteReservation(@PathVariable int resId) {
        resService.deleteRes(resId);
    }
}
