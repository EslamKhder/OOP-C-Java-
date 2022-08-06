package com.java.model;

import java.util.LinkedList;
import java.util.List;

public class Student extends BaseEntity{

    private String name;

    private List<Email> emails = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
