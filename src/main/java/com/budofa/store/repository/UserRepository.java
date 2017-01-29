package com.budofa.store.repository;

import com.budofa.store.model.User;

public interface UserRepository extends  BaseRepository<User>{

    User findByUserName(String username);

  
}