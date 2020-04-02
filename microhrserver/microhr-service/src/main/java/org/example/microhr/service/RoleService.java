package org.example.microhr.service;

import org.example.microhr.model.Role;

import java.util.List;


public interface RoleService {

    public List<Role> getAllRoles();

    public Integer addRole(Role role);

    public Integer deleteRoleById(Integer rid);
}
