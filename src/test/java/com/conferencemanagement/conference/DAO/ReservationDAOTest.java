/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.SpringBoot;
import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Room;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import static javassist.CtMethod.ConstParameter.string;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Petar
 */
@SpringBootTest(classes = SpringBoot.class)
@RunWith(SpringRunner.class)
public class ReservationDAOTest {
    
    @Autowired
    IReservationDAO resDAO;
    
    @Autowired
    IRoomDAO roomDAO;
    
    @Autowired
    IUserRepository iuserrep;
    
    public ReservationDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRes method, of class ReservationDAO.
     */
    @Test
    public void testGetAllRes() throws ParseException {
       List<Reservation> res;
       
       res = resDAO.getAllRes();
       
       String resStarts = "03-12-2017 10:30";
       DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
       Date dateS = format.parse(resStarts);
       List<Reservation> res2;
       res2 = (List<Reservation>) iuserrep.getResByMeetStarts(dateS);
       
        assertEquals(res2,res);
    }

    /**
     * Test of getResById method, of class ReservationDAO.
     */
    @Test
    public void testGetResById() {
       Reservation res = new Reservation();
       
       res = resDAO.getResById(5);
       
       
        assertEquals(5,res.getResId());
    }

    /**
     * Test of getResByMeetStarts method, of class ReservationDAO.
     */
    @Test
    public void testGetResByMeetStarts() throws ParseException {
        Reservation res = new Reservation();
            
        String resStarts = "03-12-2017 10:30";
        String resEnds = "03-12-2017 11:30";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        resDAO.addRes(res);
        
        List<Reservation> res2;
        
        res2 = (List<Reservation>) iuserrep.getResByMeetStarts(dateS);
        
        List<Reservation> all;
        all = resDAO.getAllRes();
        
        assertEquals(all, res2);
        
    }
    
    @Test
    public void testGetResByMeetEnds() throws ParseException {
        Reservation res = new Reservation();
            
        String resStarts = "03-12-2017 10:30";
        String resEnds = "03-12-2017 11:30";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        resDAO.addRes(res);
        
        List<Reservation> res2;
        
        res2 = (List<Reservation>) iuserrep.getResByMeetEnds(dateE);
        
        List<Reservation> all;
        all = resDAO.getAllRes();
        
        assertEquals(all, res2);
        
    }

    /**
     * Test of updateRes method, of class ReservationDAO.
     */
    @Test
    public void testUpdateRes() throws ParseException {
        Reservation res = new Reservation();
        
        res = resDAO.getResById(5);
        
        String resStarts = "04-12-2017 10:30";
        String resEnds = "04-12-2017 11:30";
        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
       
        
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
        
        resDAO.updateRes(res);
        
        assertEquals(dateE, res.getMeetEnds());
    }

    /**
     * Test of deleteRes method, of class ReservationDAO.
     */
    @Test
    public void testDeleteRes() throws ParseException {
            Reservation res = new Reservation();
            
        String resStarts = "03-12-2017 10:30";
        String resEnds = "03-12-2017 11:30";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        resDAO.addRes(res);
        
        
        resDAO.deleteRes(1);
        
        assertEquals(0, resDAO.getAllRes().size());
        
        
    }

    /**
     * Test of addRes method, of class ReservationDAO.
     */
    @Test
    public void testAddRes() throws ParseException {
        Reservation res = new Reservation();
       // Room room = roomDAO.getRoomById(2);
        
       
      //  res.setRoom(room);
        
        String resStarts = "03-12-2017 10:30";
        String resEnds = "03-12-2017 11:30";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        resDAO.addRes(res);
        
        Date dateE2 = resDAO.getResById(1).getMeetEnds();
        
       assertEquals(dateE2.getTime(), dateE.getTime());
        
        

    }

    /**
     * Test of resExists method, of class ReservationDAO.
     */
    @Test
    public void testResExists() throws ParseException {
          Reservation res = new Reservation();
            
        String resStarts = "03-12-2017 10:30";
        String resEnds = "03-12-2017 11:30";

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        
        Date dateS = format.parse(resStarts);
        Date dateE = format.parse(resEnds);
        res.setMeetStarts(dateS);
        res.setMeetEnds(dateE);
       
        resDAO.addRes(res);
        
//        
//       DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//       LocalDateTime ldt = LocalDateTime.parse(dateS.toString(), DATEFORMATTER);
       
        assertEquals(true,  resDAO.resExists(1,dateS));
       
    }

    
    
}
