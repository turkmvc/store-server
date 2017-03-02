package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FirmType extends BaseEntity {
	private String name;

	@OneToMany(mappedBy = "firmType", fetch = FetchType.LAZY)
	private Set<Firm> firms = new HashSet<>();

	public Set<Firm> getFirms() {
		return firms;
	}

	public void setFirms(Set<Firm> firms) {
		this.firms = firms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
