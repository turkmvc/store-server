package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubProductCategory extends BaseAuditedEntity {
	private String name;
	private String globalName;

	@ManyToOne
	private ProductCategory productCategory;

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGlobalName() {
		return globalName;
	}

	public void setGlobalName(String globalName) {
		this.globalName = globalName;
	}

}
