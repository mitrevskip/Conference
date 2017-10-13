/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.service;

import com.conferencemanagement.conference.DAO.IRoleDAO;
import com.conferencemanagement.conference.DAO.IUserRepository;
import com.conferencemanagement.conference.models.Role;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Petar
 */
@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleDAO roleDAO;
    
    @Override
    public List<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    public Role getRoleById(int roleId) {
        Role role = roleDAO.getRoleById(roleId);
        return role;
    }

    @Override
    public boolean addRole(Role role) {
        if (roleDAO.roleExists(role.getCategory())) {
            return false;
        } else {
            roleDAO.addRole(role);
            return true;
        }
    }

    @Override
    public void updateRole(Role role) {
        roleDAO.updateRole(role);
    }

    

}
