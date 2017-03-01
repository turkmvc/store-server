package com.budofa.store.service;

import com.budofa.store.controler.model.BaseDTO;
import org.springframework.stereotype.Service;

import com.budofa.store.model.User;
import com.budofa.store.repository.UserRepository;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, BaseDTO, UserRepository>implements UserService {


}
