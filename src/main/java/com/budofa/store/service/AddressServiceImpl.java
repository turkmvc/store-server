package com.budofa.store.service;

import org.springframework.stereotype.Service;

import com.budofa.store.controler.model.AddressDTO;
import com.budofa.store.model.Address;
import com.budofa.store.repository.AddressRepository;

@Service
public class AddressServiceImpl extends BaseServiceImpl<Address, AddressDTO, AddressRepository> implements AddressService {

}

