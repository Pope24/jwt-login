package com.jwtauthentication.service;

import com.jwtauthentication.model.Users;

import java.util.Optional;

public interface IUserService {
    Optional<Users> findByUsername(String name);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Users save(Users user);
}
