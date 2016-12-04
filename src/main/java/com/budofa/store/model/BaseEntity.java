package com.budofa.store.model;

import java.util.Date;

public class BaseEntity {

	private Long managedId;
	private String generatedUid;
	private Long createdUserId;
	private Long lastModifiedUserId;
	private Date createdDate;
	private Date lastModifiedDate;

	public Long getManagedId() {
		return managedId;
	}

	public void setManagedId(Long managedId) {
		this.managedId = managedId;
	}

	public String getGeneratedUid() {
		return generatedUid;
	}

	public void setGeneratedUid(String generatedUid) {
		this.generatedUid = generatedUid;
	}

	public Long getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(Long createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Long getLastModifiedUserId() {
		return lastModifiedUserId;
	}

	public void setLastModifiedUserId(Long lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
