package com.jwtauthentication.service.impl;

import com.jwtauthentication.model.Role;
import com.jwtauthentication.model.RoleName;
import com.jwtauthentication.repository.IRoleRepository;
import com.jwtauthentication.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
