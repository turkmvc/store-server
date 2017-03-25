package com.budofa.store.controler.model;

public class StoreDTO extends BaseDTO {

    private AddressDTO address;

    // TODO: will be discuss
    private Long addressId;

    private String taxNumber;

    private String imageUrl;

    private String mobileNo;

    private String mobileNo2;

    private String email;

    private String name;

    public AddressDTO getAddress() {
	return address;
    }

    public void setAddress(AddressDTO address) {
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

    public Long getAddressId() {
	return addressId;
    }

    public void setAddressId(Long addressId) {
	this.addressId = addressId;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

}
