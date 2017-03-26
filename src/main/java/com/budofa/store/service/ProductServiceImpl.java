package com.budofa.store.service;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import com.budofa.store.controler.model.FirmDTO;
import com.budofa.store.controler.model.ProductDTO;
import com.budofa.store.model.Firm;
import com.budofa.store.model.Product;
import com.budofa.store.repository.ProductRepository;

public class ProductServiceImpl extends BaseServiceImpl<Product, ProductDTO, ProductRepository>
	implements ProductService {
    @Override
    public ModelMapper getMapper() {
	
	Converter<Firm, FirmDTO> firmConverter = new AbstractConverter<Firm, FirmDTO>() {
	    protected FirmDTO convert(Firm source) {
		ModelMapper mapper = new ModelMapper();
		FirmDTO addressDTO = mapper.map(source, FirmDTO.class);
		return addressDTO;
	    }
	};

	ModelMapper mapper = new ModelMapper();
	mapper.addConverter(firmConverter);

	return mapper;
    }
}
