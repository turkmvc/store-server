package com.budofa.store;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import com.budofa.store.controler.model.AddressDTO;
import com.budofa.store.controler.model.StoreDTO;
import com.budofa.store.model.Address;
import com.budofa.store.model.Store;

public class ModelMapperTest {
    

    public static void main(String[] args) {
	Store store=new Store();
	store.setName("Store");
	Address address=new Address();
	address.setAddress("Address");
	store.setAddress(address);
	
	Converter<Address, AddressDTO> addressConverter = new AbstractConverter<Address, AddressDTO>() {
	    protected AddressDTO convert(Address source) {
		ModelMapper mapper=new ModelMapper();
		AddressDTO addressDTO=mapper.map(source, AddressDTO.class);
	      return addressDTO;
	    }
	  };
	
	ModelMapper mapper=new ModelMapper();
	mapper.addConverter(addressConverter);
	StoreDTO storeDTO=mapper.map(store, StoreDTO.class);
	System.out.println();

    }

}
