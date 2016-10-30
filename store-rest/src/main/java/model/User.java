package model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User {

    @Column(nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
