package com.budofa.store.model;

import com.budofa.store.listener.EntityAuditListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(EntityAuditListener.class)
public abstract class BaseAuditedEntity extends BaseEntity {

    /**
     * The creation date of the entity
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate = new Date();
    /**
     * Last update time for entity
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate = new Date();

    private Long createdUserId;

    /**
     * The owner of the last process.
     */
    private Long updatedUserId;

    /**
     * The ip from which the last operation was done
     */
    private String ipAddress;

    public Long getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(Long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}