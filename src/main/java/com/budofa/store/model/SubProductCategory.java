package com.budofa.store.model;

import javax.persistence.Entity;

@Entity
public class SubProductCategory extends BaseAuditedEntity{
	private String name;
	private String globalName;

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
