/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Role;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Petar
 */
@Transactional
@Repository
public class RoleDAO implements IRoleDAO{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        String hql = "FROM Role as role1 ORDER BY role1.roleId";
        return (List<Role>)entityManager.createQuery(hql).getResultList();
        
    }

    @Override
    public Role getRoleById(int roleId) {
        return entityManager.find(Role.class, roleId);
    }

    @Override
    public void updateRole(Role role) {
        entityManager.merge(role);
    }

//    @Override
//    public void deleteRole(int roleId) {
//        entityManager.remove(getRoleById(roleId));
//    }

    @Override
    public boolean roleExists(int category) {
        String hql = "FROM Role as role1 WHERE role1.category = ?";
        int count = entityManager.createQuery(hql).setParameter(1, category)
                .getResultList().size();
        return count > 0 ? true : false;  
    }

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }


//    @Override
//    public Role getRoleByCat(int category) {
//      return  entityManager.find(Role.class, category);
//    }

   
}