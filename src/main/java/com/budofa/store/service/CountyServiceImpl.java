package com.budofa.store.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;
import com.budofa.store.repository.CountyRepository;

@Service
public class CountyServiceImpl extends BaseServiceImpl<County, CountyDTO, CountyRepository> implements CountyService {

    @Autowired
    private CountyRepository countyRepository;

    @Override
    public void update(CountyDTO countyDTO) {
        County county = countyRepository.findOne(countyDTO.getId());
        county.setName(countyDTO.getName());
        countyRepository.save(county);
    }

    @Override
    public void delete(CountyDTO countyDTO) {
        countyRepository.delete(countyRepository.findOne(countyDTO.getId()));
    }

    @Override
    public CountyDTO getCounty(Long countYiD) {
        return convert(countyRepository.findOne(countYiD));
    }

    private CountyDTO convert(County county) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(county, CountyDTO.class);
    }

    private County convert(CountyDTO countyDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(countyDTO, County.class);
    }
}
