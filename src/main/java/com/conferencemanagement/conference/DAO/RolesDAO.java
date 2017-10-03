/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import java.util.List;

/**
 *
 * @author Petar
 */
public class RolesDAO implements IRolesDAO
{

    @Override
    public List<Roles> getAllRoles() {
        
    }

    @Override
    public Roles getRolesById(int rolesId) {
        return entityManager.find(Roles.class, rolesId);
    }

    @Override
    public void updateRoles(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRoles(Roles roles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rolesExists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
