package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends BaseEntity{

    public List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
