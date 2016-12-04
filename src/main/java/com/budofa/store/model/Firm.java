package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Firm extends BaseEntity {

    @OneToMany(mappedBy = "firm")
	private Set<Product> productList = new HashSet<>();

	private String name;

    @ManyToOne
    private FirmType firmType;

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FirmType getFirmType() {
		return firmType;
	}

	public void setFirmType(FirmType firmType) {
		this.firmType = firmType;
	}

}
