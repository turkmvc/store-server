package com.budofa.store.listener;

import com.budofa.store.model.BaseEntity;
import com.budofa.store.model.Status;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class EntityListener {
    /**
     * this method prepares the entity fields before save operation
     *
     * @param entity the entity to manipulate
     */
    @PrePersist
    public void onPrePersist(BaseEntity entity) {
        entity.setStatus(Status.ACTIVE);
        entity.setVersion(1);
    }

    /**
     * this method is used before update to prepare audit information
     *
     * @param entity the entity to manipulate
     */
    @PreUpdate
    public void onPreUpdate(BaseEntity entity) {
        entity.setVersion(entity.getVersion() + 1);
    }

}
