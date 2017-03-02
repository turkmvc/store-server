package com.budofa.store.service;

import org.springframework.stereotype.Service;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;
import com.budofa.store.repository.CountyRepository;

@Service
public class CountyServiceImpl extends BaseServiceImpl<County, CountyDTO, CountyRepository> implements CountyService {

}
