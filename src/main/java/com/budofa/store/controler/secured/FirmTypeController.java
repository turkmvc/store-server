package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.FirmTypeDTO;
import com.budofa.store.model.County;
import com.budofa.store.model.FirmType;
import com.budofa.store.service.FirmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/firmType")
public class FirmTypeController implements BaseSecuredController<FirmTypeDTO> {

    @Autowired
    private FirmTypeService firmTypeService;

    @Override
    public List<FirmTypeDTO> get() {
        return firmTypeService.findAll();
    }

    @Override
    public FirmTypeDTO get(@PathVariable Long id) {
        return firmTypeService.find(id);
    }

    @Override
    public void save(@RequestBody FirmTypeDTO firmTypeDTO) {
        firmTypeService.persist(firmTypeDTO);
    }

    @Override
    public void update(@Valid @RequestBody FirmTypeDTO firmTypeDTO) {

        //TODO try to implement update function in base service
        FirmType firmType = firmTypeService.findOne(firmTypeDTO.getId());

        firmType.setName(firmTypeDTO.getName());

        firmTypeService.persist(firmType);
    }

    @Override
    public void delete(@RequestBody FirmTypeDTO firmTypeDTO) {
        firmTypeService.delete(firmTypeDTO.getId());

    }
}
