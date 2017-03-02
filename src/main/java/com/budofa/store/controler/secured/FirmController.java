package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.FirmDTO;
import com.budofa.store.model.Firm;
import com.budofa.store.service.FirmService;
import com.budofa.store.service.FirmTypeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/firm")
public class FirmController implements BaseSecuredController<FirmDTO> {

    @Autowired
    private FirmService firmService;

    @Autowired
    private FirmTypeService firmTypeService;

    @Override
    public List<FirmDTO> get() {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<FirmDTO>>() {}.getType();
        return modelMapper.map(firmService.findAll(), targetListType);
    }

    @Override
    public FirmDTO get(@PathVariable Long id) {
        return firmService.find(id);
    }

    @Override
    public void save(@RequestBody FirmDTO firmDTO) {
        firmService.persist(firmDTO);
    }

    @Override
    public void update(@Valid @RequestBody FirmDTO firmDTO) {

        //TODO try to implement update function in base service
        Firm firm = firmService.findOne(firmDTO.getId());

        firm.setName(firmDTO.getName());
        firm.setFirmType(firmTypeService.findOne(firmDTO.getFirmType().getId()));

        firmService.persist(firm);
    }

    @Override
    public void delete(@RequestBody FirmDTO firmDTO) {
        firmService.delete(firmDTO.getId());
    }
}
