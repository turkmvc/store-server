package com.budofa.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.budofa.store.model.BaseEntity;
import com.budofa.store.model.County;
import com.budofa.store.repository.BaseRepository;

public abstract class BaseServiceImpl<T extends BaseEntity, R extends BaseRepository<T>> implements BaseService<T> {

    @Autowired
    protected R repository;
    @Override
    public List<T> findAll() {
        return repository.findAll();
    }


    @Override
    public List<T> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public T find(Long id) {
        return repository.findOne(id);
    }
    @Override
    public T persist(T entity) {
        return repository.save(entity);
    }
    @Override
    public List<T> persist(Iterable<T> iterable) {
        return repository.save(iterable);
    }
    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }
    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
    @Override
    public void deleteByIds(Iterable<Long> ids) {
        ids.forEach(repository::delete);
    }
    @Override
    public void delete(Iterable<? extends T> entities) {
        repository.delete(entities);
    }
    @Override
    public long count() {
        return repository.count();
    }

}
