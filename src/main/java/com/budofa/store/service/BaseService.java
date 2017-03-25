package com.budofa.store.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;

import com.budofa.store.model.BaseEntity;

public interface BaseService<T extends BaseEntity, S> {

    List<T> findAll();

    List<S> findAll(Sort sort);

    S find(Long id);

    T findOne(Long id);

    T persist(S dto);

    T persist(T entity);
    
    T update(Long id, S dto);
    
    T updateAndFlush(Long id, S dto);

    List<T> persist(Iterable<T> iterable);

    void delete(T entity);

    void delete(Long id);

    void deleteByIds(Iterable<Long> ids);

    void delete(Iterable<? extends T> entities);

    long count();
    
    ModelMapper getMapper();
}
