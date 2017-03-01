package com.budofa.store.service;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;

public interface CountyService extends BaseService<County, CountyDTO>{

    void update(CountyDTO countyDTO);

    void delete(CountyDTO countyDTO);

    CountyDTO getCounty(Long countYiD);
}
