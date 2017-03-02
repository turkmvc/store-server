package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.model.County;
import com.budofa.store.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/county")
public class CountyController implements BaseSecuredController<CountyDTO> {

    @Autowired
    private CountyService countyService;

    @Override
    public List<CountyDTO> get() {
        return countyService.findAll();
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
