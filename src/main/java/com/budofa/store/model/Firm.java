package com.budofa.store.model;

public class Firm extends BaseEntity {
	private String name;
	private FirmType firmType;

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
