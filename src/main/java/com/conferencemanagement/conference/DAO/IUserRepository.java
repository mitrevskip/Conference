/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Role;
import com.conferencemanagement.conference.models.Room;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mario HP
 */

public interface IUserRepository extends JpaRepository <Role,Long>,JpaSpecificationExecutor<Role>{

  
    @Query("SELECT r FROM Role r WHERE r.category = ?")
    public  Role  getRoleByCat(int category);
    
    @Query("SELECT r FROM Reservation r WHERE r.meetStarts = ?")
    public List<Reservation> getResByMeetStarts(Date meetStarts);
    
    @Query("SELECT r FROM Reservation r WHERE r.meetEnds = ?")
    public List<Reservation> getResByMeetEnds(Date meetEnds);
    
    @Query("SELECT r FROM Reservation r WHERE r.room = :roomId and r.meetStarts = :meetStarts")
    public  boolean  resRoomExists(int roomid, Date meetStarts);
    
//    @Query("SELECT r FROM Room r join Reservation res ON r.roomId=res.roomId WHERE r.roomId='2'")
//    public List<Room>  getAllRooms();
    
   
 }