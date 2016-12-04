package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class StoreProduct extends BaseAuditedEntity {

    @ManyToOne
    private Store store;

    @ManyToOne
    private Product product;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
