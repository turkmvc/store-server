package com.budofa.store.controler.secured.county;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(method = RequestMethod.PUT)
    public void save(@RequestBody CountyDTO countyDTO) {
        countyService.save(countyDTO);
    }

}
