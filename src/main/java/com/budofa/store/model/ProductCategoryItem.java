package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ProductCategoryItem extends BaseAuditedEntity {

    @ManyToOne
    private ProductCategory productCategory;

    @ManyToOne
    private Product product;

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
