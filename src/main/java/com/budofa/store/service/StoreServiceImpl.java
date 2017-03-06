package com.budofa.store.service;

import org.springframework.stereotype.Service;

import com.budofa.store.controler.model.StoreDTO;
import com.budofa.store.model.Store;
import com.budofa.store.repository.StoreRepository;

@Service
public class StoreServiceImpl extends BaseServiceImpl<Store, StoreDTO, StoreRepository> implements StoreService {

}
