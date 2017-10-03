/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Roles;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class RolesDAO implements IRolesDAO{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Roles> getAllRoles() {
        String hql = "FROM Roles as roles1 ORDER BY roles1.rolesId";
        return (List<Roles>)entityManager.createQuery(hql).getResultList();
        
    }

    @Override
    public Roles getRolesById(int rolesId) {
        return entityManager.find(Roles.class, rolesId);
    }

    @Override
    public void updateRoles(Roles roles) {
        Roles roles1 = getRolesById(roles.getRolesId());
        roles1.setCategory(roles.getCategory());
        entityManager.flush();
    }

    @Override
    public void deleteRoles(int rolesId) {
        entityManager.remove(getRolesById(rolesId));
    }

    @Override
    public boolean rolesExists(int rolesId, int category) {
        String hql = "FROM Roles as roles1 WHERE roles1.rolesId = ? and roles1.category = ?";
        int count = entityManager.createQuery(hql).setParameter(1, rolesId)
                .setParameter(2, category).getResultList().size();
        return count > 0 ? true : false;  
    }

    @Override
    public void addRoles(Roles roles) {
        entityManager.persist(roles);
    }
    
    
}
