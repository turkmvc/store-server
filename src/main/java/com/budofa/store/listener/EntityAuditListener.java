package com.budofa.store.listener;

import com.budofa.store.model.BaseAuditedEntity;
import com.budofa.store.util.RequestHelper;

import javax.persistence.*;
import java.util.Date;

public class EntityAuditListener {
    /**
     * this method prepares the entity fields before save operation
     *
     * @param entity the entity to manipulate
     */
    @PrePersist
    public void onPrePersist(BaseAuditedEntity entity) {
        Date now = new Date();
        entity.setCreateDate(now);
        entity.setUpdateDate(now);
        entity.setCreatedUserId(RequestHelper.getCurrentUserId());
        entity.setIpAddress(RequestHelper.getCurrentUserIpAddress());
    }

    /**
     * this method is used before update to prepare audit information
     *
     * @param entity the entity to manipulate
     */
    @PreUpdate
    public void onPreUpdate(BaseAuditedEntity entity) {
        entity.setUpdateDate(new Date());
        entity.setCreatedUserId(RequestHelper.getCurrentUserId());
        entity.setIpAddress(RequestHelper.getCurrentUserIpAddress());
    }

}
