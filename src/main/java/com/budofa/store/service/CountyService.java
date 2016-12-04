package com.budofa.store.service;

import com.budofa.store.controler.model.CountyDTO;

import java.util.List;

public interface CountyService {

    List<CountyDTO> getCounties();

    void save(CountyDTO countyDTO);
}
