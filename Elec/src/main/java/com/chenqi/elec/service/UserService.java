package com.chenqi.elec.service;

import com.chenqi.elec.domain.User;

import java.util.List;


public interface UserService {

    public User getUserById(String id);

    List<User> getAll();

    List<User> getAll2();

    List<User> getAll3();

}
