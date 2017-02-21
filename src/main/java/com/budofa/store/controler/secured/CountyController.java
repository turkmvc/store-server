package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/county")
public class CountyController {

    @Autowired
    private CountyService countyService;

    @RequestMapping(method = RequestMethod.GET)
    public List<CountyDTO> get() {
        return countyService.getCounties();
    }

    @RequestMapping(path = "/{countYiD}", method = RequestMethod.GET)
    public CountyDTO get(@PathVariable Long countYiD) {
        return countyService.getCounty(countYiD);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@Valid @RequestBody CountyDTO countyDTO) {
        countyService.save(countyDTO);
    }

}
