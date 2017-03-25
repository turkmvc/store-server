package com.budofa.store.controler.secured;

import java.lang.reflect.Type;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budofa.store.controler.model.StoreDTO;
import com.budofa.store.service.AddressService;
import com.budofa.store.service.StoreService;

@CrossOrigin(origins = "*", maxAge = 3600) // TODO fix before production. this
					   // is for allow CORS
@RestController
@RequestMapping(path = "/secure/store")
public class StoreController implements BaseSecuredController<StoreDTO> {

    @Autowired
    private StoreService storeService;

    @Autowired
    private AddressService addressService;

    @Override
    public List<StoreDTO> get() {
	ModelMapper modelMapper = new ModelMapper();
	Type targetListType = new TypeToken<List<StoreDTO>>() {
	}.getType();
	return modelMapper.map(storeService.findAll(), targetListType);
    }

    @Override
    public StoreDTO get(Long id) {
	return storeService.find(id);
    }

    @Override
    public void save(@Valid @RequestBody StoreDTO storeDTO) {
	addressService.persist(storeDTO.getAddress());
	storeService.persist(storeDTO);
    }

    @Override
    public void update(@Valid @RequestBody StoreDTO storeDTO) {
	addressService.updateAndFlush(storeDTO.getAddress().getId(), storeDTO.getAddress());
	storeService.update(storeDTO.getId(), storeDTO);
    }

    @Override
    public void delete(StoreDTO storeDto) {
	storeService.delete(storeDto.getId());

    }

}
