package com.budofa.store.model;

public class SuperProductCategory extends BaseEntity{
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
