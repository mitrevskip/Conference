/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.models.Role;
import java.util.List;

/**
 *
 * @author Petar
 */
public interface IRoleService {
    
    List<Role> getAllRoles();
    
    Role getRoleById(int roleId);
    
    boolean addRole(Role role);
    
    void updateRole(Role role);
    
    void deleteRole(int roleId);
    
    
}
