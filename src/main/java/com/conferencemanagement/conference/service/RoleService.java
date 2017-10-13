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

/**
 *
 * @author Petar
 */
public class RoleService implements IRoleService {

    @Autowired
    private IRoleDAO roleDAO;
    
    @Autowired
    private IUserRepository repDAO;

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
        if (roleDAO.roleExists(role.getRoleId(), role.getCategory())) {
            return false;
        } else {
            repDAO.
        }
    }

    @Override
    public void updateRole(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRole(int roleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
