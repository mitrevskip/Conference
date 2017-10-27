/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.Role;
import com.conferencemanagement.conference.models.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Mario HP
 */
public interface IUserRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {

    @Query("SELECT r FROM Role r WHERE r.category = ?")
    public Role getRoleByCat(int category);

    @Query("SELECT r FROM Reservation r WHERE r.meetStarts = ?")
    public List<Reservation> getResByMeetStarts(Date meetStarts);

    @Query("SELECT r FROM Reservation r WHERE r.meetEnds = ?")
    public List<Reservation> getResByMeetEnds(Date meetEnds);

    @Query("SELECT r FROM Reservation r WHERE r.room = :roomId and r.meetStarts = :meetStarts")
    public boolean resRoomExists(int roomid, Date meetStarts);

    @Query("SELECT r FROM Reservation r JOIN r.room res WHERE res.roomId='2'")
    public List<Reservation> getAllRooms2();

    @Query("SELECT u FROM User u  WHERE u.email=:email")
    public User getAllUsersWithMatchingEmail(@Param("email") String email);

}
