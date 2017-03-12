package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ProductCategory extends BaseAuditedEntity {

    @NotNull
	private String name;

	private String description;

    @OneToOne
    private ProductCategory parentCategory;

    public ProductCategory() {
    }

	public ProductCategory getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(ProductCategory parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
