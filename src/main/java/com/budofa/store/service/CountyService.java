package com.budofa.store.service;

import java.util.List;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;

public interface CountyService extends BaseService<County>{

    List<CountyDTO> getCounties();

    void save(CountyDTO countyDTO);

    CountyDTO getCounty(Long countYiD);
}
