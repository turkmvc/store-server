package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ProductRequest extends BaseAuditedEntity {

    @ManyToOne
    private Basket basket;

    @ManyToOne
    private Product product;

    private Integer amount;

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
