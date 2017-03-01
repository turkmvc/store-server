package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.FirmDTO;
import com.budofa.store.service.FirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/firm")
public class FirmController implements BaseSecuredController<FirmDTO> {

    @Autowired
    private FirmService firmService;

    @Override
    public List<FirmDTO> get() {
        return firmService.findAll();
    }

    @Override
    public FirmDTO get(@PathVariable Long id) {
        return firmService.find(id);
    }

    @Override
    public void save(@RequestBody FirmDTO firmDTO) {

    }

    @Override
    public void update(@Valid @RequestBody FirmDTO firmDTO) {

    }

    @Override
    public void delete(@RequestBody FirmDTO firmDTO) {

    }
}
