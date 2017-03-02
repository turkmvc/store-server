package com.budofa.store.service.map;

import com.budofa.store.model.BaseEntity;
import org.modelmapper.PropertyMap;

public class BaseMap<S extends BaseEntity, D> extends PropertyMap<S, D> {

    @Override
    protected void configure() {

    }
}
