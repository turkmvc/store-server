package com.budofa.store.service;

import com.budofa.store.controler.model.ProductCategoryDTO;
import com.budofa.store.model.ProductCategory;
import com.budofa.store.repository.ProductCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl extends BaseServiceImpl<ProductCategory, ProductCategoryDTO, ProductCategoryRepository>
        implements ProductCategoryService {

}
