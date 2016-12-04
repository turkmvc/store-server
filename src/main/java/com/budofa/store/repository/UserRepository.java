package com.budofa.store.repository;

import com.budofa.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @PreAuthorize(value = "isAuthenticated()")
    List<User> findAll();

    User findByUserName(@Param(value = "userName") String userName);
}