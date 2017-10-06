/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import com.conferencemanagement.conference.models.Role;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoleDAO {
    
    public List<Role> getAllRoles();
    public Role getRoleById(int roleId);
    public Role getRoleByCat(int category);
    public void updateRole(Role role);
    public void deleteRole(int roleId);
    public void addRole (Role role);
    boolean roleExists(int roleId, int category);
}
