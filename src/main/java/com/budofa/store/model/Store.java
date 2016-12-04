package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Store extends BaseAuditedEntity {

    private String name;

    @OneToOne
    private Address address;

    private String taxNumber;

    private String imageUrl;

    private String mobileNo;

    private String mobileNo2;

    private String email;

    @OneToMany(mappedBy = "store")
    private Set<StoreProduct> storeProducts = new HashSet<>();

    @OneToMany(mappedBy = "store")
    private Set<Basket> baskets = new HashSet<>();

    @OneToMany(mappedBy = "store")
    private Set<StoreRegionRange> storeRegionRanges = new HashSet<>();

    public Set<Basket> getBaskets() {
        return baskets;
    }

    public void setBaskets(Set<Basket> baskets) {
        this.baskets = baskets;
    }

    public Set<StoreRegionRange> getStoreRegionRanges() {
        return storeRegionRanges;
    }

    public void setStoreRegionRanges(Set<StoreRegionRange> storeRegionRanges) {
        this.storeRegionRanges = storeRegionRanges;
    }

    public Set<StoreProduct> getStoreProducts() {
        return storeProducts;
    }

    public void setStoreProducts(Set<StoreProduct> storeProducts) {
        this.storeProducts = storeProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileNo2() {
        return mobileNo2;
    }

    public void setMobileNo2(String mobileNo2) {
        this.mobileNo2 = mobileNo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
