package com.budofa.store.model;

import java.sql.Blob;

public class Product extends BaseEntity{
	private String name;
	//TODO discuss
	private String barCode;
	private String quarCode;
	
	private String ingrediant;
	
	private Blob productImage;

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

	public String getQuarCode() {
		return quarCode;
	}

	public void setQuarCode(String quarCode) {
		this.quarCode = quarCode;
	}

	public String getIngrediant() {
		return ingrediant;
	}

	public void setIngrediant(String ingrediant) {
		this.ingrediant = ingrediant;
	}

	public Blob getProductImage() {
		return productImage;
	}

	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}
	
}
