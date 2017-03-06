package com.budofa.store.controler.secured;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budofa.store.controler.model.StoreDTO;
import com.budofa.store.service.AddressService;
import com.budofa.store.service.StoreService;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/store")
public class StoreController implements BaseSecuredController<StoreDTO>{
    
    @Autowired
    private StoreService storeService; 
    
    @Autowired
    private AddressService addressService;

    @Override
    public List<StoreDTO> get() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public StoreDTO get(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void save(StoreDTO t) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void update(StoreDTO t) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void delete(StoreDTO t) {
	// TODO Auto-generated method stub
	
    }

}
