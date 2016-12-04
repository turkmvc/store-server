package com.budofa.store.controler.secured.county;

import com.budofa.store.controler.model.CountyDTO;
import com.budofa.store.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/county")
public class CountyController {

    @Autowired
    private CountyService countyService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<CountyDTO> get() {
        return countyService.getCounties();
    }

    @RequestMapping(path = "/", method = RequestMethod.PUT)
    public void save(@RequestBody CountyDTO countyDTO) {
        countyService.save(countyDTO);
    }

}
