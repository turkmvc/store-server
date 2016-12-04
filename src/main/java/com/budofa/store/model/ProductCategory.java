package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductCategory extends BaseAuditedEntity {

    @NotNull
	private String name;

	private String description;

    @OneToMany(mappedBy = "productCategory")
    private Set<SubProductCategory> subProductCategories = new HashSet<>();

    public ProductCategory() {
    }

    public Set<SubProductCategory> getSubProductCategories() {
        return subProductCategories;
    }

    public void setSubProductCategories(Set<SubProductCategory> subProductCategories) {
        this.subProductCategories = subProductCategories;
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
