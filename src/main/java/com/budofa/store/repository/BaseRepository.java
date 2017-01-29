package com.budofa.store.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budofa.store.model.BaseEntity;

public interface  BaseRepository<T extends BaseEntity> extends JpaRepository<T, Serializable>{


	
}
