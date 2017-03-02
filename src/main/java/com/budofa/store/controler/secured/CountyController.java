package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;
import com.budofa.store.service.CountyService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/county")
public class CountyController implements BaseSecuredController<CountyDTO> {

    @Autowired
    private CountyService countyService;

    @Override
    public List<CountyDTO> get() {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<CountyDTO>>() {}.getType();
        return modelMapper.map(countyService.findAll(), targetListType);
    }

    @Override
    public CountyDTO get(@PathVariable Long id) {
        return countyService.find(id);
    }

    @Override
    public void save(@Valid @RequestBody CountyDTO countyDTO) {
        countyService.persist(countyDTO);
    }

    @Override
    public void update(@Valid @RequestBody CountyDTO countyDTO) {

        //TODO try to implement update function in base service
        County county = countyService.findOne(countyDTO.getId());

        county.setName(countyDTO.getName());

        countyService.persist(county);
    }

    @Override
    public void delete(@Valid @RequestBody CountyDTO countyDTO) {
        countyService.delete(countyDTO.getId());
    }

}
