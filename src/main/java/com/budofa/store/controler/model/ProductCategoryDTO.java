package com.budofa.store.controler.model;

public class ProductCategoryDTO extends BaseDTO {

    private String name;

    private String description;

    private ProductCategoryDTO parentCategory;

    public ProductCategoryDTO getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ProductCategoryDTO parentCategory) {
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
