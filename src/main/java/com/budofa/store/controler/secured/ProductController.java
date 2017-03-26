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

import com.budofa.store.controler.model.ProductDTO;
import com.budofa.store.controler.model.StoreDTO;
import com.budofa.store.service.ProductService;

@CrossOrigin(origins = "*", maxAge = 3600) // TODO fix before production. this
// is for allow CORS
@RestController
@RequestMapping(path = "/secure/product")
public class ProductController implements BaseSecuredController<ProductDTO>{
    
    @Autowired
    private ProductService productService;	

    @Override
    public List<ProductDTO> get() {
	ModelMapper modelMapper = new ModelMapper();
	Type targetListType = new TypeToken<List<ProductDTO>>() {
	}.getType();
	return modelMapper.map(productService.findAll(), targetListType);
    }

    @Override
    public ProductDTO get(Long id) {
	return productService.find(id);
    }

    @Override
    public void save(@Valid @RequestBody ProductDTO productDTO) {
	productService.persist(productDTO);
    }

    @Override
    public void update(ProductDTO productDTO) {
	productService.update(productDTO.getId(), productDTO);
    }

    @Override
    public void delete(ProductDTO productDTO) {
	productService.delete(productDTO.getId());
    }

}
