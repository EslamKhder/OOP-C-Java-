package com.java.model;

import com.java.enums.Roles;

public class Role extends BaseEntity{

    private Roles name;

    private User user;

    public Roles getName() {
        return name;
    }

    public void setName(Roles name) {
        this.name = name;
    }
}
