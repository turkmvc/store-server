package com.budofa.store.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String abbreviation;

    private String name;

    private String description;

    @OneToMany(mappedBy = "role")
    private List<User> userList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
