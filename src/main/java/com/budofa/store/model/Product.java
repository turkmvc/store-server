package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product extends BaseAuditedEntity {

    private String name;

    private String barCode;

    private String qrCodeUrl;

    private String ingredient;

    private String productImageUrl;

    private BigDecimal price;

    @OneToMany
    private Set<StoreProduct> storeProducts = new HashSet<>();

    @OneToMany(mappedBy = "product")
    private Set<ProductRequest> productRequests = new HashSet<>();

    @ManyToOne
    private Firm firm;

    public Set<StoreProduct> getStoreProducts() {
	return storeProducts;
    }

    public void setStoreProducts(Set<StoreProduct> storeProducts) {
	this.storeProducts = storeProducts;
    }

    public Set<ProductRequest> getProductRequests() {
	return productRequests;
    }

    public void setProductRequests(Set<ProductRequest> productRequests) {
	this.productRequests = productRequests;
    }

    public Firm getFirm() {
	return firm;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setPrice(BigDecimal price) {
	this.price = price;
    }

    public void setFirm(Firm firm) {
	this.firm = firm;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getBarCode() {
	return barCode;
    }

    public void setBarCode(String barCode) {
	this.barCode = barCode;
    }

    public String getQrCodeUrl() {
	return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
	this.qrCodeUrl = qrCodeUrl;
    }

    public String getIngredient() {
	return ingredient;
    }

    public void setIngredient(String ingredient) {
	this.ingredient = ingredient;
    }

    public String getProductImageUrl() {
	return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
	this.productImageUrl = productImageUrl;
    }

}
