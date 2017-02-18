package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubProductCategoryItem extends BaseAuditedEntity {

    @ManyToOne
    private SubProductCategory subProductCategory;

    @ManyToOne
    private Product product;

    public SubProductCategory getSubProductCategory() {
        return subProductCategory;
    }

    public void setSubProductCategory(SubProductCategory subProductCategory) {
        this.subProductCategory = subProductCategory;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
