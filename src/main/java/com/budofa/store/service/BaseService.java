package com.budofa.store.service;

import java.util.List;

import com.budofa.store.controler.model.BaseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.budofa.store.model.BaseEntity;

public interface BaseService<T extends BaseEntity, S extends BaseDTO> {

    List<S> findAll();

    List<S> findAll(Sort sort);

    S find(Long id);

    T persist(T entity);

    List<T> persist(Iterable<T> iterable);

    void delete(T entity);

    void delete(Long id);

    void deleteByIds(Iterable<Long> ids);

    void delete(Iterable<? extends T> entities);

    long count();
}
