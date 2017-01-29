package com.budofa.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;
import com.budofa.store.repository.CountyRepository;

@Service
public class CountyServiceImpl extends BaseServiceImpl<County, CountyRepository> implements CountyService {

    @Autowired
    private CountyRepository countyRepository;

    @Override
    public List<CountyDTO> getCounties() {
        List<County> countyList = countyRepository.findAll();
        return  countyList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    //TODO use ModelMapper
    private CountyDTO convert(County county) {
        CountyDTO countyDTO = new CountyDTO();
        countyDTO.setName(county.getName());
        countyDTO.setId(county.getId());

        return countyDTO;
    }
    @Override
    public void save(CountyDTO countyDTO) {
        County county = new County();
        county.setName(countyDTO.getName());

        countyRepository.save(county);
    }

    @Override
    public CountyDTO getCounty(Long countYiD) {
        return convert(countyRepository.findOne(countYiD));
    }

}
