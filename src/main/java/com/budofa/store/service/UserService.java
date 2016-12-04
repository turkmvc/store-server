package com.budofa.store.service;

import com.budofa.store.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User find(long userId);
}
