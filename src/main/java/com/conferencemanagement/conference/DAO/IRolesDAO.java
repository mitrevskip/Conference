/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Roles;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRolesDAO {
    
    public List<Roles> getAllRoles();
    public Roles getRolesById(int rolesId);
    public void updateRoles(Roles roles);
    public void deleteRoles(int rolesId);
    public void addRoles (Roles roles);
    boolean rolesExists(int rolesId, int category);
}
