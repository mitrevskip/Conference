/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.controllers;

import com.conferencemanagement.conference.models.Role;
import com.conferencemanagement.conference.service.IRoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Petar
 */
@CrossOrigin
@RestController
@RequestMapping("/role")
public class RoleController {
    
    @Autowired
    private IRoleService roleService;
    
    @RequestMapping("/role")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
    
    @RequestMapping("/get/{roleId}")
    public Role getRoleById(@PathVariable int roleId) {
        return roleService.getRoleById(roleId);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addRole(@RequestBody Role role) {
        roleService.addRole(role);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/update/{roleId}")
    public void updateRole(@RequestBody Role role) {
        roleService.updateRole(role);
    }
    
    
}
