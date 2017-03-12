package com.budofa.store.controler.secured;

import com.budofa.store.controler.model.ProductCategoryDTO;
import com.budofa.store.model.ProductCategory;
import com.budofa.store.service.ProductCategoryService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Type;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) //TODO fix before production. this is for allow CORS
@RestController
@RequestMapping(path = "/secure/productCategory")
public class ProductCategoryController implements BaseSecuredController<ProductCategoryDTO> {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Override
    public List<ProductCategoryDTO> get() {
        ModelMapper modelMapper = new ModelMapper();
        Type targetListType = new TypeToken<List<ProductCategoryDTO>>() {}.getType();
        return modelMapper.map(productCategoryService.findAll(), targetListType);
    }

    @Override
    public ProductCategoryDTO get(@PathVariable Long id) {
        return productCategoryService.find(id);
    }

    @Override
    public void save(@RequestBody ProductCategoryDTO productCategoryDTO) {
        productCategoryService.persist(productCategoryDTO);
    }

    @Override
    public void update(@Valid @RequestBody ProductCategoryDTO productCategoryDTO) {

        //TODO try to implement update function in base service
        ProductCategory productCategory = productCategoryService.findOne(productCategoryDTO.getId());

        productCategory.setName(productCategoryDTO.getName());
        productCategory.setDescription(productCategoryDTO.getDescription());

        ProductCategory parent = new ProductCategory();
        parent.setId(productCategoryDTO.getParentCategory().getId());
        productCategory.setParentCategory(parent);

        productCategoryService.persist(productCategory);
    }

    @Override
    public void delete(@RequestBody ProductCategoryDTO productCategoryDTO) {
        productCategoryService.delete(productCategoryDTO.getId());
    }
}
