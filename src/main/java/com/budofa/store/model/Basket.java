package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Basket extends BaseAuditedEntity {

    private BasketStatus basketStatus;

    @OneToMany(mappedBy = "basket")
    private Set<ProductRequest> productRequests = new HashSet<>();

    @ManyToOne
    private Store store;

    @ManyToOne
    private User user;

    private BigDecimal price;

    public BasketStatus getBasketStatus() {
        return basketStatus;
    }

    public void setBasketStatus(BasketStatus basketStatus) {
        this.basketStatus = basketStatus;
    }

    public Set<ProductRequest> getProductRequests() {
        return productRequests;
    }

    public void setProductRequests(Set<ProductRequest> productRequests) {
        this.productRequests = productRequests;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
