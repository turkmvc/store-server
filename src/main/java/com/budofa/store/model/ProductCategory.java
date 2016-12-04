package com.budofa.store.model;

public class ProductCategory extends BaseEntity{
  
	private String name;
	private String globalName;
	private SuperProductCategory superProductCategory;
	

	public SuperProductCategory getSuperProductCategory() {
		return superProductCategory;
	}

	public void setSuperProductCategory(SuperProductCategory superProductCategory) {
		this.superProductCategory = superProductCategory;
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
