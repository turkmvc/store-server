package com.budofa.store.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class County extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "county")
    private Set<StoreRegionRange> storeRegionRanges = new HashSet<>();

    @OneToMany(mappedBy = "county")
    private Set<Address> addresses = new HashSet<>();

    public Set<StoreRegionRange> getStoreRegionRanges() {
        return storeRegionRanges;
    }

    public void setStoreRegionRanges(Set<StoreRegionRange> storeRegionRanges) {
        this.storeRegionRanges = storeRegionRanges;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
