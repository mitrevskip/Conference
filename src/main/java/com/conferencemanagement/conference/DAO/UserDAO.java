/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Petar
 */
public class UserDAO implements IUserDAO{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String hql = "FROM User as user1 ORDER BY user1.userId";
        return (List<User>)entityManager.createQuery(hql).getResultList();
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
        User user1 = getUserById(user.getUserId());
        user1.setEmail(user.getEmail());
        user1.setPassword(user1.getPassword());
        user1.setUserName(user1.getUserName());
        user1.setRole(user1.getRole());
        
    }

    @Override
    public void deleteUser(int userId) {
        entityManager.remove(getUserById(userId));
    }

    @Override
    public boolean userExists(String userName, String email) {
        String hql = "FROM User as user1 WHERE user1.userName = ? and user1.email = ?";
        int count = entityManager.createQuery(hql).setParameter(1, userName)
                .setParameter(2, email).getResultList().size();
        return count > 0 ? true : false;
    }
    
}
