package com.budofa.store.model;

import javax.persistence.*;

@Entity
public class Address extends BaseAuditedEntity {

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    private String header;
    private String mobileNo;
    private String mobileNo2;

    @ManyToOne
    private County county;
    private String address;
    private String description;

    @OneToOne
    private User user;

    @OneToOne
    private Store store;

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

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
