package com.budofa.store.controler.secured;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.budofa.store.controler.model.AddressDTO;
import com.budofa.store.service.AddressService;
////?????????????????? olmayacak gibi
public class AddressController implements BaseSecuredController<AddressDTO>{
    
    @Autowired
    private AddressService addressService;


    @Override
    public List<AddressDTO> get() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public AddressDTO get(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void save(AddressDTO t) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void update(AddressDTO t) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void delete(AddressDTO t) {
	// TODO Auto-generated method stub
	
    }

}
