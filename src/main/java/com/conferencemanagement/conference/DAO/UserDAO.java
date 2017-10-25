/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Reservation;
import com.conferencemanagement.conference.models.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class UserDAO implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String hql = "FROM User as user1 ORDER BY user1.userId";
        return entityManager.createQuery(hql).getResultList();
//    return (List<User>) entityManager.createQuery(hql).setHint("javax.persistence.loadgraph", postGraph).getResultList();
    }

    @Override
    public List<Reservation> getAllReservations(int userId) {
        String hql = "FROM Reservation as res ORDER BY meetStarts WHERE res.userId = ?";

        return entityManager.createQuery(hql).setParameter(1, userId).getResultList();
    }

    @Override
    public User getUserById(int userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);

    }

    @Override
    public void deleteUser(int userId) {
        entityManager.remove(getUserById(userId));
    }

    @Override
    public boolean userExists(String userName) {
        String hql = "FROM User as user1 WHERE user1.userName = ?";
        int count = entityManager.createQuery(hql).setParameter(1, userName)
                .getResultList().size();
        return count > 0 ? true : false;
    }

    @Override
    public boolean emailExists(String email) {
        String hql = "FROM User as user1 WHERE user1.email = ?";
        int count = entityManager.createQuery(hql).setParameter(1, email)
                .getResultList().size();
        return count > 0 ? true : false;
        
    }

    @Override
    public User getUserByEmail(String email) {
        return entityManager.find(User.class, email);
    }

}
