package com.budofa.store.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.budofa.store.model.BaseEntity;
import com.budofa.store.repository.BaseRepository;

public abstract class BaseServiceImpl<T extends BaseEntity, S, R extends BaseRepository<T>>
        implements BaseService<T, S> {

    @Autowired
    protected R repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public List<S> findAll(Sort sort) {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<S>>() {}.getType();
        return modelMapper.map(repository.findAll(sort), targetListType);
    }

    @Override
    public S find(Long id) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(repository.findOne(id), findClassForS());
    }

    @Override
    public T findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public T persist(S dto) {
        ModelMapper modelMapper = new ModelMapper();
        T entity = modelMapper.map(dto, findClassForT());
        return repository.save(entity);
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

    private Class<T> findClassForT() {
        return (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }

    private Class<S> findClassForS() {
        return (Class<S>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[1];
    }

}
