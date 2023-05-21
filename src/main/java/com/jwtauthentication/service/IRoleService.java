package com.jwtauthentication.service;

import com.jwtauthentication.model.Role;
import com.jwtauthentication.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
